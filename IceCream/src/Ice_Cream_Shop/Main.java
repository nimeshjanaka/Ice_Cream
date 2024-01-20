package Ice_Cream_Shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> specialsList = new ArrayList<>();
        specialsList.add("Enjoy a limited-time our delectable ice cream, " +
                "where selected flavors are available at a reduced price to sweeten your indulgence");
        specialsList.add("Celebrate the season with our exclusive special discount, " );

        // Create a list of promotions
        List<String> promotionsList = new ArrayList<>();
        promotionsList.add("Take advantage of promotions, " +
                "treating delightful combinations of flavors with exciting discounts on selected ice cream offerings, " +
                "making every visit a delicious experience.");
        promotionsList.add("Join us in savoring the joy of our current promotions, " +
                "where you can explore enticing deals on a variety of ice cream delights, " +
                "each promotion designed to add an extra layer of sweetness to your moments of indulgence.");

        // Create a list of delivery estimators
        List<String> deliveryEstimatorList = new ArrayList<>();
        deliveryEstimatorList.add("Coffee Ice Cream with Apple Butter toppings");
        deliveryEstimatorList.add("Chocolate Ice Cream with Hot Fudge toppings");

        // Create an instance of IceCreamShop and set values
        IceCreamShop iceCreamShop = new IceCreamShop("Menu Contents", specialsList, promotionsList, deliveryEstimatorList);

        // Print the IceCreamShop details
        System.out.println(iceCreamShop);

    }
}

