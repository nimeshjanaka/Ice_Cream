package Builder_Patern;

import java.util.List;

public class IceCreamShop {

    private String iceCreamMenu;
    private List<String> specials;
    private List<String> promotions;
    private List<String> deliveryEstimator;

    private IceCreamShop(Builder builder) {
        this.iceCreamMenu = builder.iceCreamMenu;
        this.specials = builder.specials;
        this.promotions = builder.promotions;
        this.deliveryEstimator = builder.deliveryEstimator;
    }



    public static class Builder {
        private String iceCreamMenu;
        private List<String> specials;
        private List<String> promotions;
        private List<String> deliveryEstimator;

        public Builder iceCreamMenu(String iceCreamMenu) {
            this.iceCreamMenu = iceCreamMenu;
            return this;
        }

        public Builder specials(List<String> specials) {
            this.specials = specials;
            return this;
        }

        public Builder promotions(List<String> promotions) {
            this.promotions = promotions;
            return this;
        }

        public Builder deliveryEstimator(List<String> deliveryEstimator) {
            this.deliveryEstimator = deliveryEstimator;
            return this;
        }

        public IceCreamShop build() {
            return new IceCreamShop(this);
        }
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
