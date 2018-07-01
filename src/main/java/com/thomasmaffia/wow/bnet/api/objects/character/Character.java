package com.thomasmaffia.wow.bnet.api.objects.character;

import com.thomasmaffia.wow.bnet.api.objects.guild.Guild;

/**
 * {@link Character} Pojo for Character object.
 * @author Tom Maffia <ta.maffia@gmail.com>
 *
 */

public class Character {
    private final String name;
    private final String realm;
    private final String battlegroup;
    private final CharacterClass charClass;
    private final Race race;
    private final Gender gender;
    private final int level;
    private final long achievementPoints;
    private final String thumbnail;
    private final Faction faction;
    private int itemLevel;
    private int itemLevelEquipped;
    private Guild guild;
    private int guildRank;
    private int artifactLevel;

    public Character(String name, String realm, String battlegroup,
                     CharacterClass charClass, Race race, Gender gender,
                     int level, long achievementPoints, String thumbnail, Faction faction) {
        this.name = name;
        this.realm = realm;
        this.battlegroup = battlegroup;
        this.charClass = charClass;
        this.race = race;
        this.gender = gender;
        this.level = level;
        this.achievementPoints = achievementPoints;
        this.thumbnail = thumbnail;
        this.faction = faction;
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

    public CharacterClass getCharClass() {
        return charClass;
    }

    public Race getRace() {
        return race;
    }

    public Gender getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public long getAchievementPoints() {
        return achievementPoints;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public Faction getFaction() {
        return faction;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public int getItemLevelEquipped() {
        return itemLevelEquipped;
    }

    public void setItemLevelEquipped(int itemLevelEquipped) {
        this.itemLevelEquipped = itemLevelEquipped;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public int getGuildRank() {
        return guildRank;
    }

    public void setGuildRank(int guildRank) {
        this.guildRank = guildRank;
    }

    public int getArtifactLevel() {
        return artifactLevel;
    }

    public void setArtifactLevel(int artifactLevel) {
        this.artifactLevel = artifactLevel;
    }
}