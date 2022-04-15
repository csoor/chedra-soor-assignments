import java.util.ArrayList;

public class Order {
    private String name;
    private Boolean ready;
    private ArrayList<Item> items = new ArrayList<>();

    //Constructor
    public Order()
    {
        this.name = "Guest";
        this.ready = false;
    }
    //Overloaded Constructor
    public Order(String name)
    {
        this.name = name;
        this.ready = false;
    }
    //Getters
    public String getName()
    {
        return name;
    }
    public Boolean getReady()
    {
        return ready;
    }
    public ArrayList<Item> getItem()
    {
        return items;
    }
    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setReady(Boolean ready)
    {
        this.ready = ready;
    }
    public void setItem(ArrayList<Item> items)
    {
        this.items = items;
    }
    //Methods
    public void addItem(Item item)
    {
        this.items.add(item);
    }
    public String getStatusMessage()
    {
        if(this.ready == true)
        {
            return "Your order is ready.";
        }
        else
        {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal()
    {
        double sum = 0;
        for (Item price: this.items)
        {
            sum += price.getPrice();
        }
        return sum;
    }
    public void display()
    {
        System.out.printf("Customer Name: %s\n", this.name);
        for(Item i: this.items)
        {
            System.out.printf(i.getName(), "- $" + i.getPrice());
        }
        System.out.printf("Total: $", this,getOrderTotal());
    }
}
