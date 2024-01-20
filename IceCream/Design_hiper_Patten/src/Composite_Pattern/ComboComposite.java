package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ComboComposite implements IceCreamComponent{

    private List<IceCreamComponent> components = new ArrayList<>();

    public void addComponent(IceCreamComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Combo Ice Cream:");
        for (IceCreamComponent component : components) {
            component.display();
        }
    }
}
