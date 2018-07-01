package com.thomasmaffia.wow.bnet.api.objects.character;

public enum Race {
    HUMAN(1, "Human"),
    ORC(2, "Orc"),
    DWARF(3, "Dwarf"),
    NIGHT_ELF(4, "Night Elf"),
    UNDEAD(5, "Undead"),
    TAUREN(6, "Tauren"),
    GNOME(7, "Gnome"),
    TROLL(8, "Troll"),
    GOBLIN(9, "Goblin"),
    BLOOD_ELF(10, "Blood Elf"),
    DRAENEI(11, "Draenei"),
    WORGEN(22, "Worgen"),
    PANDAREN(24, "Neutral Pandaren"),
    ALLIANCE_PANDAREN(25, "Neutral Pandaren"),
    HORDE_PANDAREN(26, "Horde Pandaren"),
    NIGHTBORNE(27, "Nightborne"),
    HIGHMOUNTAIN_TAUREN(28, "Highmountain Tauren"),
    VOID_ELF(29, "Void Elf"),
    LIGHTFORGED_DRAENEI(30, "Lightforged Draenei");

    private final int raceId;
    private final String raceName;

    Race(int raceId, String raceName){
        this.raceId = raceId;
        this.raceName = raceName;
    }

    public static Race get(int raceId) {
        for(Race r : Race.values()) {
            if(r.raceId == raceId) {
                return r;
            }
        }
        return null;
    }

    public int getRaceId() {
        return raceId;
    }

    public String getRaceName() {
        return raceName;
    }
}
