package com.foxin.decorator_pattern;

public class Warrior extends Decorator {

    Characters warriorCharacter;

    public Warrior(Characters character){
        super(character);
        warriorCharacter = character;
    }

    public void basicAttack(Characters character, Characters target){
        target.hpPool = target.hpPool - 30;
    }

    public void setHpAndManaPools(Characters character){
        character.hpPool = 150;
        character.manaPool = 0;
    }
    public int getHpPool(Characters character){
        return character.hpPool;
    }

    public int getManaPool(Characters character){
        return character.manaPool;
    }
}
