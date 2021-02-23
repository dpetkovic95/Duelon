package classes;
import character.Elf;
import interfaces.Warrior;

public class ElfKnight extends Elf implements Warrior{

    
    public void fight() {
        System.out.println("I'm fightning");
    }

}
