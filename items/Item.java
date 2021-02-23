package items;

public abstract class Item
{
    protected double value;
    protected String category;
    protected String name;

    public Item() {
    }

    public Item(double value) {
        this.value = value;
    }
    
    public abstract double getValue ();
    
    public abstract void setValue (double value);
    
    public String toString(){
        String out = "";
        out += name + ", Category: "+ category +", Value: " + value + "\n";
        return out;
    }
}
