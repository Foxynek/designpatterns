package com.foxin.decorator_pattern;

public class Paladin extends Decorator {

    Characters paladinCharacter;

    public Paladin(Characters character){
        super(character);
        paladinCharacter = character;
    }

    public void basicAttack(Characters character, Characters target){
        target.hpPool = target.hpPool - 20;
        character.hpPool = character.hpPool + (character.manaPool/2);
        character.manaPool = character.manaPool - 10;
    }

    public void setHpAndManaPools(Characters character){
        character.hpPool = 100;
        character.manaPool = 32;
    }
    public int getHpPool(Characters character){
        return character.hpPool;
    }

    public int getManaPool(Characters character){
        return character.manaPool;
    }
}
