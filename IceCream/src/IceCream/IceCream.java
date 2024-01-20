package IceCream;

import Toppings.Toppings;
import Flavor.Flavor;

import java.util.ArrayList;
import java.util.List;

public class IceCream {

    private int iceCreamId;
    private List<String> baseFlavor;
    private List<String> toppings;

    public <E> IceCream(int i, Flavor chocolateFlavor, ArrayList<E> es) {
    }

    public IceCream(int flavorId, String flavorName) {
    }

    public IceCream() {
    }

    public IceCream(int i, Flavor chocolateFlavor, List<Toppings> sprinklesTopping) {
    }


    public int getIceCreamId() {
        return iceCreamId;
    }

    public void setIceCreamId(int iceCreamId) {
        this.iceCreamId = iceCreamId;
    }

    public List<String> getBaseFlavor() {
        return baseFlavor;
    }

    public void setBaseFlavor(List<String> baseFlavor) {
        this.baseFlavor = baseFlavor;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "iceCreamId=" + iceCreamId +
                ", baseFlavor=" + baseFlavor +
                ", toppings=" + toppings +
                '}';
    }
}
