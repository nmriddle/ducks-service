package com.example.ducksservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Type {
    MALLARD, REDHEAD, RUBBER_DUCK, DECOY_DUCK;

    @JsonCreator
    public static Type fromText(String text) {
        for (Type type : Type.values()) {
            System.out.println(type.toString());
            System.out.println(text);
            if (type.toString().equalsIgnoreCase(text)) {
                return type;
            }
        }
        // Default case or handle as needed
        return null;
    }

    public String toString() {
        switch (this) {
            case MALLARD:
                return "Mallard";
            case REDHEAD:
                return "Redhead";
            case RUBBER_DUCK:
                return "Rubber_Duck";
            case DECOY_DUCK:
                return "Decoy_Duck";
            default:
                return "unspecified";
        }
    }
}
