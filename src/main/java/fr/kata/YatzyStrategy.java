package fr.kata;

/**
 * The strategy interface
 * 
 * @author a177212
 *
 */
public interface YatzyStrategy {
	final static String CHANCE_STRATEGY = "CHANCE", NUMBER_STRATEGY = "NUMBER", KIND_STRATEGY = "KIND",
			PAIR_STRATEGY = "PAIR", STRAIGHT_STRATEGY = "STRAIGHT";

	public int getScore();
}
