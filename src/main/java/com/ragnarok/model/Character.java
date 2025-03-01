package com.ragnarok.model;

import com.ragnarok.model.attributes.BaseAttributes;
import com.ragnarok.model.attributes.CharacterStats;
import com.ragnarok.model.enums.ClassType;
import com.ragnarok.model.interfaces.CharacterActions;
import com.ragnarok.model.interfaces.LevelSystem;

public class Character implements CharacterActions, LevelSystem {
    private String name;
    private int baseLevel;
    private int jobLevel;
    private ClassType currentClass;
    private BaseAttributes attributes;
    private CharacterStats stats;

    public Character(String name) {
        this.name = name;
        this.baseLevel = 1;
        this.jobLevel = 1;
        this.currentClass = ClassType.NOVICE;
        this.attributes = new BaseAttributes();
        this.stats = new CharacterStats();
    }

    @Override
    public void levelUp() {
        if(canLevelUp()) {
            baseLevel++;
            stats.setHp(stats.getHp() + 15);
            stats.setSp(stats.getSp() + 10);
            stats.setCurrentExp(0);
            stats.setMaxExp(stats.getMaxExp() + 20);
        }
    }

    @Override
    public void jobLevelUp() {
        if(canJobLevelUp())  {
            jobLevel++;
            stats.setCurrentJobExp(0);
            stats.setMaxJobExp(stats.getMaxJobExp() + 10);
        }
    }

    @Override
    public boolean changeClass(ClassType newClass) {
        if(jobLevel >= 10 && currentClass == ClassType.NOVICE) {
            currentClass = newClass;
            jobLevel = 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean canLevelUp() {
        return baseLevel < 99 && stats.getCurrentExp() >= stats.getMaxExp();
    }

    @Override
    public boolean canJobLevelUp() {
        return jobLevel < 50 && stats.getCurrentJobExp() >= stats.getMaxJobExp();
    }

    @Override
    public void addExperience(int exp) {
        stats.setCurrentExp(stats.getCurrentExp() + exp);
        while(canLevelUp()) {
            levelUp();
        }
    }

    @Override
    public void addJobExperience(int exp) {
        stats.setCurrentJobExp(stats.getCurrentJobExp() + exp);
        while(canJobLevelUp()) {
            jobLevelUp();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseLevel() {
        return baseLevel;
    }

    public void setBaseLevel(int baseLevel) {
        this.baseLevel = baseLevel;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public ClassType getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(ClassType currentClass) {
        this.currentClass = currentClass;
    }

    public BaseAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(BaseAttributes attributes) {
        this.attributes = attributes;
    }

    public CharacterStats getStats() {
        return stats;
    }

    public void setStats(CharacterStats stats) {
        this.stats = stats;
    }
}
