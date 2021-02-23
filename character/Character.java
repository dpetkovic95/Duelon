package character;
import items.Item;

public abstract class Character {

	protected String rase;
	protected String name;
	protected double speed;
	protected double strength;
	protected double durability;
	protected double intelligence;
	
	protected Item [] items;
	
	public Character () {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public abstract double getSpeed();
	public abstract void setSpeed(double speed);
	
	public abstract double getStrength();
	public abstract void setStrength(double strength);
	
	public abstract double getDurability();
	public abstract void setDurability(double durability);
	
	public abstract double getIntelligence();
	public abstract void setIntelligence(double intelligence);
	
	public String toString ()
    {
        String out = "";
        int i = 0;
        
        out += "Name: " + name + "\n";
        out += "Rase: " + rase + "\n";
        out += "Speed: " + speed + "\n";
        out += "Strength: " + strength + "\n";
        out += "Durability: " + durability + "\n";
        out += "Intelligence: " + intelligence + "\n";
        out += "Items: \n";
        
        while(i < items.length){
            out += (i+1) + ". " + items[i] ;
            i++;
        } 
        
        
        return out;
    }
	
}
