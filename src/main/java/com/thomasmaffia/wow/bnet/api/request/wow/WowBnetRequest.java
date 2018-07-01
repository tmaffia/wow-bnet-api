package com.thomasmaffia.wow.bnet.api.request.wow;

import com.thomasmaffia.wow.bnet.api.request.Region;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * {@link IWowBnetRequest} Impletments battlenet requests
 * @author Tom Maffia <ta.maffia@gmail.com>
 *
 */

public class WowBnetRequest implements IWowBnetRequest {

    private final Region region;

    private Map<String, String> generalRequestParams;

    protected WowBnetRequest(Region region, Locale locale, String apiKey,
                          Map<String, String> pathParams, Map<String, String> generalRequestParams) {
        this.region = region;
        this.generalRequestParams = new HashMap<>();
        this.generalRequestParams.put("locale", locale.toString());
        this.generalRequestParams.put("apikey", apiKey);
    }

    /**
     * @param realm         Character realm name
     * @param characterName Character name
     * @return Full request URL in String form
     */
    @Override
    public String requestCharacter(String realm, String characterName) {
        String[] pathSuffix = {realm, characterName};
        return buildRequest(createPath(WowApiType.CHARACTER, pathSuffix), this.generalRequestParams);
    }

    @Override
    public String requestCharacterAchievements(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterFeed(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterGuild(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterItems(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterMounts(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterPets(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterProfessions(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterProgression(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterPvp(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterStatistics(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterStats(String realm, String characterName) {
        return null;
    }

    @Override
    public String requestCharacterAudit(String realm, String characterName) {
        return null;
    }

    /**
     * @param realm     Guild realm name
     * @param guildName Guild name
     * @return Full request URL in String form
     */
    @Override
    public String requestGuild(String realm, String guildName) {
        return null;
    }

    @Override
    public String requestGuildMembers(String realm, String guildName) {
        return null;
    }

    @Override
    public String requestGuildAchievements(String realm, String guildName) {
        return null;
    }

    @Override
    public String requestGuildNews(String realm, String guildName) {
        return null;
    }

    @Override
    public String requestGuildChallenge(String realm, String guildName) {
        return null;
    }

    /**
     * @param bossId Id of boss
     * @return Full request URL in String form
     */
    @Override
    public String requestBoss(String bossId) {
        return null;
    }

    @Override
    public String requestBosses() {
        return null;
    }

    /**
     * @param itemId Id of item
     * @return Full request URL in String form
     */
    @Override
    public String requestItem(String itemId) {
        return null;
    }

    /**
     * @param itemSetId Id of item set
     * @return Full request URL in String form
     */
    @Override
    public String requestItemSet(String itemSetId) {
        return null;
    }

    /**
     * @param spellId Id of spell
     * @return Full request URL in String form
     */
    @Override
    public String requestSpell(String spellId) {
        return null;
    }

    private String createPath(WowApiType apiType, String[] paths) {
        StringBuilder path = new StringBuilder(apiType.getApiPath());
        for(String p : paths) {
            path.append("/").append(p);
        }
        return path.toString();
    }

    private String buildRequest(String path, Map<String, String> requestParams) {
        StringBuilder builder = new StringBuilder(region.getUrl());
        builder.append(path);

        builder.append("?");
        requestParams.forEach((k, v) -> builder.append(k).append("=").append(v).append("&"));
        return builder.substring(0, builder.toString().length() - 1);
    }

    protected Region getRegion() {
        return region;
    }

    protected Map<String, String> getGeneralRequestParams() {
        return generalRequestParams;
    }
}
