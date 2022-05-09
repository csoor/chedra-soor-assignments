public class BankAccount {
    private double checking;
    private double savings;
    public static int numAccount = 0;
    public static double total = 0;

    //Constructor
    public BankAccount(){
        numAccount ++;
        this.checking = 0;
        this.savings = 0;
    }
    //Getters
    public double getChecking()
    {
        return checking;
    }
    public double getSavings()
    {
        return savings;
    }
    public void deposit(double amount, String account)
    {
        if (account == "checking") 
        {
            checking += amount;
        } 
        else if(account == "savings")
        {
            savings += amount;
        }


    }

    public void withdraw(double amount, String account)
    {
        boolean complete = false;
        if (account == "checking")
        {
            if(checking - amount >= 0)
            {
                complete = true;
                checking -= amount;
                System.out.println("Withdraw: " + amount);
            }
        }
        else if(account == "savings")
        {
            if(savings - amount >= 0)
            {
                complete = true;
                savings -= amount;
                System.out.println("Withdraw: " + amount);
            }
        }
        if(complete)
        {
            total -= amount;
        }
        else 
        {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance()
    {
        System.out.printf("Checking: %s\n", checking);
        System.out.printf("Savings: %s\n", savings);
    }
}
