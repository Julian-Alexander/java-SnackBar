package SnackBarAPP;

public class Main
{
    public static void main(String[] args)
    {
        // Customers
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        // Vending Machines
        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");


        // Snacks
        // Snacks in Vending Machine 1 "Food"
        Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());

        // Snacks in Vending Machine 2 "Drink"
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());

        // Processing

        // First task
        System.out.println("\n***Customer 1 buys 3 Sodas***");
        c1.purchase(3, s4);
        System.out.println("Customer 1 remaining cash: " + c1.cash());
        System.out.println("Sodas remaining: " + s4.getQuant());

        // Second task
        System.out.println("\n***Customer 1 buys 1 Pretzel***");
        c1.purchase(1, s3);
        System.out.println("Customer 1 remaining cash: " + c1.cash());
        System.out.println("Pretzels remaining: " + s3.getQuant());

        // Third task
        System.out.println("\n***Customer 2 buys 2 Sodas***");
        c2.purchase(2, s4);
        System.out.println("Customer 2 remaining cash: " + c2.cash());
        System.out.println("Sodas remaining: " + s4.getQuant());

        // Fourth task
        System.out.println("\n***Customer 1 Finds $10***");
        c1.addCash(10);
        System.out.println("Customer 1 remaining cash: " + c1.cash());

        // Fifth task
        System.out.println("\n***Customer 1 buys 1 Chocolate Bar***");
        c1.purchase(1, s2);
        System.out.println("Customer 1 remaining cash: " + c1.cash());
        System.out.println("Chocolate Bars remaining: " + s2.getQuant());

        // Sixth task
        System.out.println("\n***Snack 3 gets +12***");
        s3.restore(12);
        System.out.println("Pretzels remaining: " + s3.getQuant());

        // Seventh task
        System.out.println("\n***Customer 2 buys 3 Pretzels***");
        c2.purchase(3, s3);
        System.out.println("Customer 2 remaining cash: " + c2.cash());
        System.out.println("Pretzels remaining: " + s3.getQuant());
    }
}
