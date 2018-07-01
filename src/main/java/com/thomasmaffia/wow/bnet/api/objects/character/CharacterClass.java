package com.thomasmaffia.wow.bnet.api.objects.character;

public enum CharacterClass {

    WARRIOR(1, "Warrior"),
    PALADIN(2, "Paladin"),
    HUNTER(3, "Hunter"),
    ROGUE(4, "Rogue"),
    PRIEST(5, "Priest"),
    DEATH_KNIGHT(6, "Death Knight"),
    SHAMAN(7, "Shaman"),
    MAGE(8, "Mage"),
    WARLOCK(9, "Warlock"),
    MONK(10, "Monk"),
    DRUID(11, "Druid"),
    DEMON_HUNTER(12, "Demon Hunter");

    private final int classId;
    private final String className;

    CharacterClass(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public static CharacterClass get(int classId) {
        for(CharacterClass c : CharacterClass.values()) {
            if(c.classId == classId) {
                return c;
            }
        }
        return null;
    }

    public int getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }
}
