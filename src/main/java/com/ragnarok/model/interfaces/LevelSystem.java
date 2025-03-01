package com.ragnarok.model.interfaces;

public interface LevelSystem {
    boolean canLevelUp();
    boolean canJobLevelUp();
    void addExperience();
    void addJobExperience();
}
