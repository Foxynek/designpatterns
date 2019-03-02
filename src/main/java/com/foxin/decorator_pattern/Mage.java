package com.foxin.decorator_pattern;

public class Mage extends Decorator {

    Characters mageCharacter;

    public Mage(Characters character){
        super(character);
        mageCharacter = character;
    }

    public void basicAttack(Characters character, Characters target){
        target.hpPool = target.hpPool - (10+(character.manaPool/2));
        character.manaPool = character.manaPool - 10;
    }

    public void setHpAndManaPools(Characters character){
        character.hpPool = 80;
        character.manaPool = 64;
    }
    public int getHpPool(Characters character){
        return character.hpPool;
    }

    public int getManaPool(Characters character){
        return character.manaPool;
    }
}
