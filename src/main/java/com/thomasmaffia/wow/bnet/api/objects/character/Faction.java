package com.thomasmaffia.wow.bnet.api.objects.character;

public enum Faction {
    ALLIANCE(0),
    HORDE(1);

    private final int factionId;
    Faction(int factionId){
        this.factionId = factionId;
    }

    public static Faction get(int factionId) {
        for(Faction f : Faction.values()) {
            if(f.factionId == factionId) {
                return f;
            }
        }
        return null;
    }
}
