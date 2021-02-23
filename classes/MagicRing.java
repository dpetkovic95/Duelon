package classes;
import items.Artifact;

public class MagicRing extends Artifact{

    public MagicRing() {
        this.name = "Magic ring";
    }

    public MagicRing(double damage, double healing, double value) {
        super(damage, healing, value);
        this.name = "Magic ring";
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealing() {
        return healing;
    }

    public void setHealing(double healing) {
        this.healing = healing;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
}
