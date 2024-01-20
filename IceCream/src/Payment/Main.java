package Payment;

import Status.Status;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Create an instance of Status
        Status paymentStatus = Status.PAID; // Assuming Status is an enum

        // Create a list for payment status
        List<Status> paymentStatusList = new ArrayList<>();
        paymentStatusList.add(paymentStatus);

        // Create an instance of Payment and set values
        Payment payment = new Payment(1, 45, paymentStatusList, 42);

        // Print the Payment details
        System.out.println(payment);
    }
}


