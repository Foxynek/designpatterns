package com.foxin.decorator_pattern;

public class Decorator extends Characters {

    Characters decorateCharacter;

    public Decorator(Characters character){
        decorateCharacter = character;
    }

    public void basicAttack(Characters character, Characters target){
        //character.basicAttack(character, target);
    }

    public void setHpAndManaPools(Characters character){

    }
    public int getHpPool(Characters character){
        return character.hpPool;
    }

    public int getManaPool(Characters character){
        return character.manaPool;
    }
}
