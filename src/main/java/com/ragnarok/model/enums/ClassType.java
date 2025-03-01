package com.ragnarok.model.enums;

public enum ClassType {
    NOVICE("Novice"),
    SWORDMAN("Swordman"),
    ARCHER("Archer"),
    MAGE("Mage"),
    MERCHANT("Merchant"),
    THIEF("Thief"),
    ACOLYTE("Acolyte");

    private final String className;

    ClassType(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
