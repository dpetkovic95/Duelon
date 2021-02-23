package items;


public abstract class Weapon extends Item
{
    protected double damage;
    protected double correctness;

    public Weapon() {
        this.category = "Weapon";
    }

    public Weapon(double damage, double correctness, double value) {
        super(value);
        this.damage = damage;
        this.correctness = correctness;
        this.category = "Weapon";
    }

    public abstract double getDamage ();
    
    public abstract void setDamage (double damage);
    
    public abstract double getCorrectness ();
    
    public abstract void setCorrectness (double correctness);
    
     public String toString(){
        return super.toString() + "(Damage: " + damage + ", Correctness: " + correctness + ")\n";
    }
}
