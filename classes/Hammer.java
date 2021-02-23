package classes;
import items.Tool;

public class Hammer extends Tool
{

    public Hammer() {
        this.name = "Hammer";
    }

    public Hammer(double repair, double value) {
        
        super(repair, value);
        this.name = "Hammer";
    }
    
   
    public double getValue ()
    {
        return this.value;
    }
    
    
    public void setValue (double value)
    {
        this.value = value;
    }
    
   
    public double getRepair ()
    {
        return this.repair;
    }
    
   
    public void setRepair (double repair)
    {
        this.repair = repair;
    }
}
