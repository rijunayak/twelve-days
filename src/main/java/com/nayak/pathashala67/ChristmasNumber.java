package com.nayak.pathashala67;

public class ChristmasNumber {
    private final int value;
    private final String ordinal;
    private final String number;
    private final ChristmasNumber previousNumber;

    private ChristmasNumber(int value, String ordinal, String number, ChristmasNumber previousNumber) {
        this.value = value;
        this.ordinal = ordinal;
        this.number = number;
        this.previousNumber = previousNumber;
    }

    public static final ChristmasNumber One = new ChristmasNumber(1, "first", "a", null);
    public static final ChristmasNumber Two = new ChristmasNumber(2, "second", "two", One);
    public static final ChristmasNumber Three = new ChristmasNumber(3, "third", "three", Two);
    public static final ChristmasNumber Four = new ChristmasNumber(4, "fourth", "four", Three);
    public static final ChristmasNumber Five = new ChristmasNumber(5, "fifth", "five", Four);
    public static final ChristmasNumber Six = new ChristmasNumber(6, "sixth", "six", Five);
    public static final ChristmasNumber Seven = new ChristmasNumber(7, "seventh", "seven", Six);
    public static final ChristmasNumber Eight = new ChristmasNumber(8, "eighth", "eight", Seven);
    public static final ChristmasNumber Nine = new ChristmasNumber(9, "ninth", "nine", Eight);
    public static final ChristmasNumber Ten = new ChristmasNumber(10, "tenth", "ten", Nine);
    public static final ChristmasNumber Eleven = new ChristmasNumber(11, "eleventh", "eleven", Ten);
    public static final ChristmasNumber Twelve = new ChristmasNumber(12, "twelfth", "twelve", Eleven);

    String ordinal() {
        return ordinal;
    }

    String number() {
        return number;
    }

    int value() {
        return value;
    }

    public boolean isGreaterThanOrEqualTo(ChristmasNumber other) {
        return value >= other.value;
    }

    public ChristmasNumber decrement() throws UnsupportedOperationException {
        if(previousNumber != null) {
            return previousNumber;
        }
        throw new UnsupportedOperationException("Cannot decrement the lowest Christmas number");
    }
}
