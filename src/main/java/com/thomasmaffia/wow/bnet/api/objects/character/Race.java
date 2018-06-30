package com.thomasmaffia.wow.bnet.api.objects.character;

public enum Race {
    HUMAN(1),
    ORC(2),
    DWARF(3),
    NIGHT_ELF(4),
    UNDEAD(5),
    TAUREN(6),
    GNOME(7),
    TROLL(8),
    GOBLIN(9),
    BLOOD_ELF(10),
    DRAENEI(11),
    WORGEN(22),
    PANDAREN(24),
    ALLIANCE_PANDAREN(25),
    HORDE_PANDAREN(26),
    NIGHTBORNE(27),
    HIGHMOUNTAIN_TAUREN(28),
    VOID_ELF(29),
    LIGHTFORGED_DRAENEI(30);

    private final int raceId;
    Race(int raceId){
        this.raceId = raceId;
    }

    public static Race get(int raceId) {
        for(Race r : Race.values()) {
            if(r.raceId == raceId) {
                return r;
            }
        }
        return null;
    }
}
