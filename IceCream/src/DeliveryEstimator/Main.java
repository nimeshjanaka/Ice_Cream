package DeliveryEstimator;

import DeliveryEstimator.DeliveryEstimator;

import java.sql.Time;


public class Main {
    public static void main(String[] args) {

        DeliveryEstimator de = new DeliveryEstimator();

        // Create a Time object with specific values
        Time estimatedTime = new Time(0, 45, 0);  // Assuming 2 hours, 30 minutes, and 0 seconds

        // Set the estimate delivery time using the setEstimateDeliveryTime method
        de.setEstimateDeliveryTime(estimatedTime);

        // Retrieve and print the estimated delivery time
        Time retrievedTime = de.getEstimateDeliveryTime();
        System.out.println("Estimated Delivery Time: " + retrievedTime.getHours() + " hours, " +
                retrievedTime.getMinutes() + " minutes, " + retrievedTime.getSeconds() + " seconds");
    }
}

