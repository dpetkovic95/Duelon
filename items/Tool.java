package items;


public abstract class Tool extends Item
{
    protected double repair;

    public Tool() {
        this.category = "Tool";
    }

    public Tool(double repair, double value) {
        super(value);
        this.repair = repair;
        this.category = "Tool";
    }
    
    public abstract double getRepair ();
    public abstract void setRepair (double repair);
    
    public String toString(){
        return super.toString() + "(Repair: " + repair + ")\n";
    }
}

