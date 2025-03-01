package com.ragnarok.model.attributes;

public class CharacterStats {
    private int hp;
    private int sp;
    private int currentExp;
    private int currentJobExp;
    private int maxExp;
    private int maxJobExp;

    public CharacterStats() {
        this.hp = 40;
        this.sp = 10;
        this.currentExp = 0;
        this.currentJobExp = 0;
        this.maxExp = 100;
        this.maxJobExp = 50;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public int getCurrentJobExp() {
        return currentJobExp;
    }

    public void setCurrentJobExp(int currentJobExp) {
        this.currentJobExp = currentJobExp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public int getMaxJobExp() {
        return maxJobExp;
    }

    public void setMaxJobExp(int maxJobExp) {
        this.maxJobExp = maxJobExp;
    }
}
