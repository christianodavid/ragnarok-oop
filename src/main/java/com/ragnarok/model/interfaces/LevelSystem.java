package com.ragnarok.model.interfaces;

public interface LevelSystem {
    boolean canLevelUp();
    boolean canJobLevelUp();
    void addExperience(int exp);
    void addJobExperience(int exp);
}
