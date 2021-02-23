package character;
import items.Item;

public class Dwarf extends Character{
	
	private static final double minSpeed = 10;
    private static final double maxSpeed = 60;
    private static final double minStrength = 40;
    private static final double maxStrength = 90;
    private static final double minDurability = 50;
    private static final double maxDurability = 100;
    private static final double minIntelligence = 20;
    private static final double maxIntelligence = 70;

    public Dwarf () {
    	this.rase = "Dwarf";
    }
	
    public double getSpeed ()
    {
        return speed;
    }
    
    public void setSpeed (double speed)
    {
        if (speed < minSpeed) speed = minSpeed;
        if (speed > maxSpeed) speed = maxSpeed;
        this.speed = speed;
    }
    
   
    public double getStrength ()
    {
        return strength;
    }
   
    public void setStrength (double strength)
    {
        if (strength < minStrength) strength = minStrength;
        if (strength > maxStrength) strength = maxStrength;
        this.strength = strength;
    }
    
    
    public double getDurability ()
    {
        return durability;
    }
    
    public void setDurability (double durability)
    {
        if (durability < minDurability) durability = minDurability;
        if (durability > maxDurability) durability = maxDurability;
        this.durability = durability;
    }
    
    
    public double getIntelligence ()
    {
        return intelligence;
    }
    
    
    public void setIntelligence (double intelligence)
    {
        if (intelligence < minIntelligence ) intelligence = minIntelligence ;
        if (intelligence > maxIntelligence ) intelligence = maxIntelligence ;
        this.intelligence = intelligence;
    }
    
   
    public Item [] getItems ()
    {
        return items;
    }
    
   
    public void setItems (Item [] items)
    {
        this.items = items;
    }

    
}
