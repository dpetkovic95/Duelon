package classes;

import items.Weapon;


public class Sword extends Weapon{
	    
	     public Sword() {
	        this.name = "Sword";
	    }

	    public Sword(double damage, double correctness, double value) {
	        
	        super(damage, correctness, value);
	        this.name = "Sword";
	    }

	    public double getDamage() {
	        return damage;
	    }

	    public void setDamage(double damage) {
	        this.damage = damage;
	    }

	    public double getCorrectness() {
	        return correctness;
	    }

	    public void setCorrectness(double correctness) {
	        this.correctness = correctness;
	    }

	    public double getValue() {
	        return value;
	    }

	    public void setValue(double value) {
	        this.value = value;
	    }

	    
	}