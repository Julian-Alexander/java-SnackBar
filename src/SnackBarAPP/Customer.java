package SnackBarAPP;

public class Customer
{
    private static int maxId = 0;
    private int id;
    public String Cname;
    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.Cname = name;
        this.cash = cash;
    }

    public int getId()
    {
        return id;
    }

    public double cash()
    {
        return this.cash;
    }

    public void addCash(int i)
    {
        this.cash += i;
    }

    public String getName()
    {
        return this.Cname;
    }

    public void setName(String name)
    {
        this.Cname = name;
    }

    public void purchase(int snacks, Snack snack)
    {
        double cost = snacks * snack.cost;
        this.cash -= cost;
        snack.buy(snacks);
    }
}
