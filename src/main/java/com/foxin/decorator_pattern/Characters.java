package com.foxin.decorator_pattern;

public abstract class Characters {

    public int hpPool;
    public int manaPool;

    abstract public void basicAttack(Characters character, Characters target);
    abstract public void setHpAndManaPools(Characters character);
    abstract public int getHpPool(Characters character);
    abstract public int getManaPool(Characters character);
}
