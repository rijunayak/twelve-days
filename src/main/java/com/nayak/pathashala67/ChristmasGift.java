package com.nayak.pathashala67;

public class ChristmasGift {
    private static final String GIFT_FORMAT = "%s %s";
    private final String name;

    public ChristmasGift(String name) {
        this.name = name;
    }

    public String format(ChristmasNumber quantity) {
        return String.format(GIFT_FORMAT, quantity.number(), name);
    }
}
