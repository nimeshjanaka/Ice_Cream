package Order;

import Method.Method;
import OrderItems.OrderItems;
import Status.Status;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Create an instance of OrderItems
        OrderItems item1 = new OrderItems("Vanilla", 8);
        OrderItems item2 = new OrderItems("Chocolate", 14);
        OrderItems item3 = new OrderItems("Strawberry", 11);
        OrderItems item4 = new OrderItems("Rocky Road", 2);
        OrderItems item5 = new OrderItems("Coffee", 17);
        OrderItems item6 = new OrderItems("Pistachio", 8);


        // Create an instance of Status
        Status orderStatus = Status.ORDERED; // Assuming Status is an enum
        Status orderStatus1 = Status.PREPARING;
        Status orderStatus2 = Status.DELIVERED;
        Status orderStatus3 = Status.OUT_FOR_DELIVERY;


        // Create an instance of Method
        Method deliveryMethod = new Method(1, "Home Delivery");
        Method deliveryMethod1 = new Method(2, "Take Away");

        // Create lists for items, order status, and delivery method
        List<OrderItems> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);

        List<Status> orderStatusList = new ArrayList<>();
        orderStatusList.add(orderStatus);
        orderStatusList.add(orderStatus1);
        orderStatusList.add(orderStatus2);
        orderStatusList.add(orderStatus3);

        List<Method> deliveryMethodList = new ArrayList<>();
        deliveryMethodList.add(deliveryMethod);
        deliveryMethodList.add(deliveryMethod1);

        // Create an instance of the Order class and set values
        Order order = new Order(1, itemsList, orderStatusList, deliveryMethodList);

        // Print the Order details
        System.out.println(order);
    }
}

