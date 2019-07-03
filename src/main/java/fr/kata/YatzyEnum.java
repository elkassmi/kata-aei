package fr.kata;

public enum YatzyEnum {
	ONE(1), TOW(2), THREE(3), FOR(4), FIVE(5), SIXE(6);
	private final int value;

	YatzyEnum(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
