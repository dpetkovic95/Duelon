package main;
import classes.*;
import items.*;




public class Main {
	public static void main (String[] args) {
		
		OrcMage Ragnar = new OrcMage();
		
		Ragnar.setName("Ragnar");
		Ragnar.setDurability(50);
		Ragnar.setSpeed(40);
		Ragnar.setStrength(90);
		Ragnar.setIntelligence(200);
		
		Item []RagnarItems = new Item[2];
		RagnarItems[0] = new Sword(10,20,30);
		RagnarItems[1] = new MagicRing(10,10,10);
		Ragnar.setItems(RagnarItems);
		
		System.out.println(Ragnar);
	}
}
