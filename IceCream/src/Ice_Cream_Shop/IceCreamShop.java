package Ice_Cream_Shop;

import java.util.List;

public class IceCreamShop {

    private String iceCreamMenu;
    private List<String> specials;
    private List<String> promotions;
    private List<String> deliveryEstimator;

    public IceCreamShop(String iceCreamMenu, List<String> specials, List<String> promotions, List<String> deliveryEstimator) {
        this.iceCreamMenu = iceCreamMenu;
        this.specials = specials;
        this.promotions = promotions;
        this.deliveryEstimator = deliveryEstimator;
    }

    public String getIceCreamMenu() {
        return iceCreamMenu;
    }

    public void setIceCreamMenu(String iceCreamMenu) {
        this.iceCreamMenu = iceCreamMenu;
    }

    public List<String> getSpecials() {
        return specials;
    }

    public void setSpecials(List<String> specials) {
        this.specials = specials;
    }

    public List<String> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<String> promotions) {
        this.promotions = promotions;
    }

    public List<String> getDeliveryEstimator() {
        return deliveryEstimator;
    }

    public void setDeliveryEstimator(List<String> deliveryEstimator) {
        this.deliveryEstimator = deliveryEstimator;
    }

    @Override
    public String toString() {
        return "IceCreamShop{" +
                "iceCreamMenu='" + iceCreamMenu + '\'' +
                ", specials=" + specials +
                ", promotions=" + promotions +
                ", deliveryEstimator=" + deliveryEstimator +
                '}';
    }
}
