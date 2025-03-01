package com.ragnarok.service;

import com.ragnarok.model.Character;
import com.ragnarok.model.enums.ClassType;

public class CharacterService {
    public Character createCharacter(String name) {
        return new Character(name);
    }

    public boolean changeClass(Character character, ClassType newClass) {
        return character.changeClass(newClass);
    }

    public void gainExperience(Character character, int exp) {
        character.addExperience(exp);
    }

    public void gainJobExperience(Character character, int exp) {
        character.addJobExperience(exp);
    }
}
