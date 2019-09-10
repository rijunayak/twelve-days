package com.nayak.pathashala67;

import java.util.List;

import static com.nayak.pathashala67.ChristmasNumber.One;

public class Stanza {
    private static final String STANZA_TEMPLATE = "One the %s day of Christmas my true love gave to me:%s.";

    private final List<ChristmasGift> christmasGifts;
    private final ChristmasNumber day;

    public Stanza(List<ChristmasGift> christmasGifts, ChristmasNumber day) {
        this.christmasGifts = christmasGifts;
        this.day = day;
    }

    public String formattedLine() {
        StringBuilder formattedGifts = new StringBuilder();
        for (ChristmasNumber quantity = day; quantity.isGreaterThanOrEqualTo(One); quantity = quantity.decrement()) {
            ChristmasGift christmasGift = christmasGifts.get(quantity.value() - 1);
            String template = quantity.equals(One) ? " %s" : " %s,";
            formattedGifts.append(String.format(template, christmasGift.format(quantity)));
            if (quantity.equals(One)) {
                break;
            }
        }
        return String.format(STANZA_TEMPLATE, day.ordinal(), formattedGifts);
    }
}
