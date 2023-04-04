package io.turntabl.card;

/**
 * @author Rhume & Michael.
 */
public enum ValueEnum {

    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"),
    TEN("10"), J("10"), Q("10"), K("10"), A("11");

    private String value;

    ValueEnum(String value) {
        this.value = value;
    }

    public int getIntegerValue() {
        return Integer.parseInt(getValue());
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ValueEnum { " + "value = '" + value + '}';
    }
}
