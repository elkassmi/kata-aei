package fr.kata;

import fr.kata.impl.YatzyChance;
import fr.kata.impl.YatzyDefault;
import fr.kata.impl.YatzyKind;
import fr.kata.impl.YatzyNumber;
import fr.kata.impl.YatzyPairs;
import fr.kata.impl.YatzyStraight;

public class YatzyFactory {
	public static YatzyStrategy getInstance(String strategy,int nmrOccurence, int ... dices) {
		switch (strategy) {
		case YatzyStrategy.CHANCE_STRATEGY:
			return new YatzyChance(nmrOccurence,dices);
		case YatzyStrategy.KIND_STRATEGY:
			return new YatzyKind(nmrOccurence,dices);
		case YatzyStrategy.PAIR_STRATEGY:
			return new YatzyPairs(nmrOccurence,dices);
		case YatzyStrategy.STRAIGHT_STRATEGY:
			return new YatzyStraight(nmrOccurence,dices);
		case YatzyStrategy.NUMBER_STRATEGY:
			return new YatzyNumber(nmrOccurence,dices);
		default: 
			return new YatzyDefault(nmrOccurence, dices);
		}
	}
}
