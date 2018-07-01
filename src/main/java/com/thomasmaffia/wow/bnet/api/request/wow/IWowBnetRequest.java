package com.thomasmaffia.wow.bnet.api.request.wow;

/**
 * {@link IWowBnetRequest} Interface for generic Wow battlnet request.
 * @author Tom Maffia <ta.maffia@gmail.com>
 *
 */

public interface IWowBnetRequest {

    /**
     *
     * @param realm Character realm name
     * @param characterName Character name
     * @return Full request URL in String form
     */
    String requestCharacter(String realm, String characterName);
    String requestCharacterAchievements(String realm, String characterName);
    String requestCharacterFeed(String realm, String characterName);
    String requestCharacterGuild(String realm, String characterName);
    String requestCharacterItems(String realm, String characterName);
    String requestCharacterMounts(String realm, String characterName);
    String requestCharacterPets(String realm, String characterName);
    String requestCharacterProfessions(String realm, String characterName);
    String requestCharacterProgression(String realm, String characterName);
    String requestCharacterPvp(String realm, String characterName);
    String requestCharacterStatistics(String realm, String characterName);
    String requestCharacterStats(String realm, String characterName);
    String requestCharacterAudit(String realm, String characterName);

    /**
     *
     * @param realm Guild realm name
     * @param guildName Guild name
     * @return Full request URL in String form
     */
    String requestGuild(String realm, String guildName);
    String requestGuildMembers(String realm, String guildName);
    String requestGuildAchievements(String realm, String guildName);
    String requestGuildNews(String realm, String guildName);
    String requestGuildChallenge(String realm, String guildName);

    /**
     *
     * @param bossId Id of boss
     * @return Full request URL in String form
     */
    String requestBoss(String bossId);
    String requestBosses();

    /**
     *
     * @param itemId Id of item
     * @return Full request URL in String form
     */
    String requestItem(String itemId);

    /**
     *
     * @param itemSetId Id of item set
     * @return Full request URL in String form
     */
    String requestItemSet(String itemSetId);

    /**
     *
     * @param spellId Id of spell
     * @return Full request URL in String form
     */
    String requestSpell(String spellId);
}
