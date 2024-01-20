package Builder_Patern;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IceCreamShop iceCreamShop = new IceCreamShop.Builder()
                .iceCreamMenu("CONES[Chocolate, Cookies, Toffee] " +
                        "/ " +
                        "SORBETS[Cherry, Strawberry, Lemon]")
                .specials(List.of("Pistachio Ice Cream Cold Brew Decaf Cafe Latte",
                        "Pistachio Ice Cream Triple Vanilla"))
                .promotions(List.of("Pistachio Ice Cream Cold Brew Decaf Cafe Latte off 20%",
                        "Pistachio Ice Cream Triple Vanilla off 15%"))
                .deliveryEstimator(List.of("5min", "45min"))
                .build();

        System.out.println(iceCreamShop);
    }
}