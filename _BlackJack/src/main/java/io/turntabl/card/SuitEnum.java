package io.turntabl.card;

/**
 * @author Rhume & Michael.
 */
public enum SuitEnum {
    SPADE("S"),
    DIAMOND("D"),
    CLUB("C"),
    HEART("H");

    private String suitSymbol;

    SuitEnum(String symbol) {
        suitSymbol = symbol;
    }

    public String getSuitSymbol() {
        return suitSymbol;
    }

    @Override
    public String toString() {
        return "SuitEnum { suitSymbol = " + suitSymbol + '}';
    }
}
