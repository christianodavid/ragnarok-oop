package com.ragnarok.model.attributes;

public class BaseAttributes {
    private int strength;
    private int agility;
    private int vitality;
    private int intelligence;
    private int dexterity;
    private int luck;

    public BaseAttributes() {
        this.strength = 1;
        this.agility = 1;
        this.vitality = 1;
        this.intelligence = 1;
        this. dexterity = 1;
        this.luck = 1;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }
}
