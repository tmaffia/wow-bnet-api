package com.thomasmaffia.wow.bnet.api.objects.character;

/**
 * {@link Faction} Enum for character factions.
 * @author Tom Maffia <ta.maffia@gmail.com>
 *
 */

public enum Faction {
    ALLIANCE(0, "Alliance"),
    HORDE(1, "Horde");

    private final int factionId;
    private final String factionName;

    Faction(int factionId, String factionName){
        this.factionId = factionId;
        this.factionName = factionName;
    }

    public static Faction get(int factionId) {
        for(Faction f : Faction.values()) {
            if(f.factionId == factionId) {
                return f;
            }
        }
        return null;
    }

    public int getFactionId() {
        return factionId;
    }

    public String getFactionName() {
        return factionName;
    }
}
