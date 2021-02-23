package items;


public abstract class Artifact extends Item
{
    protected double damage;
    protected double healing;

    public Artifact() {
        this.category = "Artifact";
    }

    public Artifact(double damage, double healing, double value) {
        super(value);
        this.damage = damage;
        this.healing = healing;
        this.category = "Artifact";
    }
    
    public abstract double getDamage ();
    
    public abstract void setDamage (double damage);
    
    public abstract double getHealing ();
    
    public abstract void setHealing (double healing);    
    
    public String toString(){
        return super.toString() + "(Damage: " + damage + ", Healing: " + healing + ")\n";
    }
}
