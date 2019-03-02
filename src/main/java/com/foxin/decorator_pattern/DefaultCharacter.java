package com.foxin.decorator_pattern;

public class DefaultCharacter extends Characters{

    public void basicAttack(Characters character, Characters target){
        target.hpPool = target.hpPool - 10;
    }

    public void setHpAndManaPools(Characters character){
        character.hpPool = 100;
        character.manaPool = 50;
    }

    public int getHpPool(Characters character){
        return character.hpPool;
    }

    public int getManaPool(Characters character){
        return character.manaPool;
    }

}
