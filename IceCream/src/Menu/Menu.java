package Menu;

import Toppings.Toppings;
import Flavor.Flavor;

import java.util.List;

public class Menu {

    private List<Flavor> flavors;
    private List<Toppings> toppings;

    public Menu(List<Flavor> flavors, List<Toppings> toppings) {
        this.flavors = flavors;
        this.toppings = toppings;
    }

    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "flavors=" + flavors +
                ", toppings=" + toppings +
                '}';
    }
}
