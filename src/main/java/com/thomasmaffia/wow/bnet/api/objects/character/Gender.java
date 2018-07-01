package com.thomasmaffia.wow.bnet.api.objects.character;

public enum Gender {
    MALE(0, "Male"),
    FEMALE(1, "Female");

    private final int genderId;
    private final String genderName;

    Gender(int genderId, String genderName) {
        this.genderId = genderId;
        this.genderName = genderName;
    }

    public static Gender get(int genderId) {
        for(Gender g : Gender.values()) {
            if(g.genderId == genderId) {
                return g;
            }
        }
        return null;
    }

    public int getGenderId() {
        return genderId;
    }

    public String getGenderName() {
        return genderName;
    }
}
