package com.thomasmaffia.wow.bnet.api.objects.character;

public enum CharacterClass {

    WARRIOR(1),
    PALADIN(2),
    HUNTER(3),
    ROGUE(4),
    PRIEST(5),
    DEATH_KNIGHT(6),
    SHAMAN(7),
    MAGE(8),
    WARLOCK(9),
    MONK(10),
    DRUID(11),
    DEMON_HUNTER(12);

    private final int classId;
    CharacterClass(int classId) {
        this.classId = classId;
    }

    public static CharacterClass get(int classId) {
        for(CharacterClass c : CharacterClass.values()) {
            if(c.classId == classId) {
                return c;
            }
        }
        return null;
    }
}
