package Builder_Patern;

import java.util.List;

public class IceCream {

    private int iceCreamId;
    private Flavor baseFlavor;
    private List<Toppings> toppings;

    public IceCream(int iceCreamId, Flavor baseFlavor, List<Toppings> toppings) {
        this.iceCreamId = iceCreamId;
        this.baseFlavor = baseFlavor;
        this.toppings = toppings;
    }
}
