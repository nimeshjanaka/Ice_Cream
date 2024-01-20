package Flavor;

import IceCream.IceCream;

public class Flavor extends IceCream {

    private int flavorId;
    private String flavorName;



    public Flavor(int flavorId, String flavorName) {
        super(flavorId, flavorName);
        this.flavorId = flavorId;
        this.flavorName = flavorName;
    }

    public int getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(int flavorId) {
        this.flavorId = flavorId;
    }

    public String getFlavorName() {
        return flavorName;
    }

    @Override
    public String toString() {
        return "Flavor{" +
                "flavorId=" + flavorId +
                ", flavorName='" + flavorName + '\'' +
                '}';
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }
}
