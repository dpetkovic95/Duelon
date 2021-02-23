package classes;

import interfaces.Hunter;
import character.Dwarf;

public class DwarfHunter extends Dwarf implements Hunter
{
    
    public void hunt()
    {
        System.out.println("I'm hunting");
    }

	
}