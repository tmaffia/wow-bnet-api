package com.thomasmaffia.wow.bnet.api.objects.guild;

import com.thomasmaffia.wow.bnet.api.objects.character.Faction;

import java.util.ArrayList;

public class Guild {

    private final String name;
    private final String realm;
    private final String battlegroup;
    private final int level;
    private final Faction faction;
    private final long achievementPoints;
    private ArrayList<Character> members;

    public Guild(String name, String realm, String battlegroup,
                 int level, Faction faction, long achievementPoints) {
        this.name = name;
        this.realm = realm;
        this.battlegroup = battlegroup;
        this.level = level;
        this.faction = faction;
        this.achievementPoints = achievementPoints;
    }

    public String getName() {
        return name;
    }

    public String getRealm() {
        return realm;
    }

    public String getBattlegroup() {
        return battlegroup;
    }

    public int getLevel() {
        return level;
    }

    public Faction getFaction() {
        return faction;
    }

    public long getAchievementPoints() {
        return achievementPoints;
    }

    public ArrayList<Character> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Character> members) {
        this.members = members;
    }
}
