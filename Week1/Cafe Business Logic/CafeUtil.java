import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal()
    {
        int sum = 0;
        for(int weeks = 1; weeks < 11; weeks++)
        {
            sum += weeks;
        }
            
        return sum;
    }

    public double getOrderTotal(double[] lineItems)
    {
        double sum = 0;
        for (double price: lineItems)
        {
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems)
    {
        for(int i = 0; i < menuItems.size(); i++)
        {
            System.out.println(i + " "+ menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers)
    {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello! " + userName);
        System.out.println("There are " + customers.size() + " people ahead of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}
