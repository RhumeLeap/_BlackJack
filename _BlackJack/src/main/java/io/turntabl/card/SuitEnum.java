package io.turntabl.card;

public enum SuitEnum {
    SPADE("S"),
    DIAMOND("D"),
    CLUB("C"),
    HEART("H");

    private String suitSymbol;

    SuitEnum(String symbol) {
        suitSymbol = symbol;
    }
}
