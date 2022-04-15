public class Test {
    public static void main(String[] args)
    {
        //Item variables
        Item item1 = new Item("Mocha", 3.3);
        Item item2 = new Item("Latte", 4.2);
        Item item3 = new Item("drip Coffee", 5.4);
        Item item4 = new Item("Cappuccino", 4.2);

        //Order variables
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Aria");
        Order order4 = new Order("Sammy");
        Order order5 = new Order("Pikachu");

        order1.addItem(item3);
        order2.addItem(item2);
        order3.addItem(item4);
        order4.addItem(item1);
        order5.addItem(item4);

        //Display Orders
        System.out.println(order1.getName());
        System.out.println(order1.getStatusMessage());
    }
}
