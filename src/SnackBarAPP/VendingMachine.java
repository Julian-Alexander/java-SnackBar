package SnackBarAPP;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    public String VMname;

    public VendingMachine(String name)
    {
        maxId ++;
        id = maxId;
        VMname = name;
    }

    public String getName()
    {
        return this.VMname;
    }

    public int getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.VMname = name;
    }
}
