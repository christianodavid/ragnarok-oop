package com.ragnarok.model.interfaces;

import com.ragnarok.model.enums.ClassType;

public interface CharacterActions {
    void levelUp();
    void jobLevelUp();
    boolean changeClass(ClassType newClass);
}
