package Toppings;

import Flavor.Flavor;
import IceCream.IceCream;

import java.util.ArrayList;

public class Toppings extends IceCream {

    private int toppingsId;
    private String toppingsName;

    public <E> Toppings(int i, Flavor chocolateFlavor, ArrayList<E> es) {
        super(i, chocolateFlavor, es);
    }

    public Toppings(int toppingsId, String toppingsName) {
    }

    public int getToppingsId() {
        return toppingsId;
    }

    public void setToppingsId(int toppingsId) {
        this.toppingsId = toppingsId;
    }

    public String getToppingsName() {
        return toppingsName;
    }

    public void setToppingsName(String toppingsName) {
        this.toppingsName = toppingsName;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingsId=" + toppingsId +
                ", toppingsName='" + toppingsName + '\'' +
                '}';
    }
}

