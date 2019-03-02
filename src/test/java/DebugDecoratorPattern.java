import com.foxin.decorator_pattern.*;
import org.junit.Test;

public class DebugDecoratorPattern {

    @Test
    public void debugDecoratorPattern(){

        Characters peon = new DefaultCharacter();
        Characters mage = new DefaultCharacter();
        Characters warrior = new DefaultCharacter();
        Characters paladin = new DefaultCharacter();

        mage = new Mage(mage);
        warrior = new Warrior(warrior);
        paladin = new Paladin(paladin);

        peon.setHpAndManaPools(peon);
        mage.setHpAndManaPools(mage);
        warrior.setHpAndManaPools(warrior);
        paladin.setHpAndManaPools(paladin);

        mage.basicAttack(mage, peon);
        warrior.basicAttack(warrior, mage);
        paladin.basicAttack(paladin, warrior);
        peon.basicAttack(peon, paladin);

        System.out.println("Peon hp: " + peon.getHpPool(peon) + " mana: " + peon.getManaPool(peon));
        System.out.println("Warrior hp: " + warrior.getHpPool(warrior) + " mana: " + warrior.getManaPool(warrior));
        System.out.println("Mage hp: " + mage.getHpPool(mage) + " mana: " + mage.getManaPool(mage));
        System.out.println("Paladin hp: " + paladin.getHpPool(paladin) + " mana: " + paladin.getManaPool(paladin));
    }
}
