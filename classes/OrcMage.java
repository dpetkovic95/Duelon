package classes;
import character.Orc;
import interfaces.Mage;

public class OrcMage extends Orc implements Mage{

    @Override
    public void castMagic() {
        System.out.println("I'm casting magic");
    }
    
    
}
