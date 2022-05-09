public class Test {
    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(500.50, "checking");
        myAccount.deposit(100, "savings");

        myAccount.displayBalance();

        myAccount.withdraw(99, "savings");
        myAccount.withdraw(22, "checking");

        myAccount.displayBalance();
    }
}
