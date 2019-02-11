package SnackBarAPP;

public class Snack
{
    private static int maxId = 0;
    public int id;
    public String name;
    private int quant;
    public double cost;
    public int vendorID;

    public Snack(String name, int quant, double cost, int vendorID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quant = quant;
        this.cost = cost;
        this.vendorID = vendorID;
    }

    public void setName(String newName)
    {
        this.name = name;
    }

    public int getQuant()
    {
        return this.quant;
    }

    public void buy(int i)
    {
        this.quant -= i;
    }

    public double pay(int i)
    {
        return this.cost * i;
    }

    public void restore(int i)
    {
        this.quant += i;
    }
}
