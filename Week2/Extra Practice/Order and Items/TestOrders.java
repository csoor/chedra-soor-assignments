import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args)
    {
        //Item Variables
        Items item1 = new Items();
        Items item2 = new Items();
        Items item3 = new Items();
        Items item4 = new Items();
        //Menu
        item1.name = "Mocha";
        item2.name = "Latte";
        item3.name = "dripCoffee";
        item4.name = "Cappuccino";

        item1.price = 2.5;
        item2.price = 2.8;
        item3.price = 3.7;
        item4.price = 4.5;
        //Order Variables
        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 = new Orders();
        Orders order4 = new Orders();
        //Set each order's name
        order1.name = "Cinduri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        //Application Simulations
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
