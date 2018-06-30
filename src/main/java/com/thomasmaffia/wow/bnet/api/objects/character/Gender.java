package com.thomasmaffia.wow.bnet.api.objects.character;

public enum Gender {
    MALE(0),
    FEMAIL(1);

    private final int genderId;
    Gender(int genderId) {
        this.genderId = genderId;
    }

    public static Gender get(int genderId) {
        for(Gender g : Gender.values()) {
            if(g.genderId == genderId) {
                return g;
            }
        }
        return null;
    }
}
