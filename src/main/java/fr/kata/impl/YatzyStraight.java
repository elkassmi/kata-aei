package fr.kata.impl;

import java.util.Arrays;

public class YatzyStraight extends YatzyDefault {
	public YatzyStraight(int nmrOccurence, int ... dices) {
		super(nmrOccurence, dices);
	}

	@Override
	public int getScore() {
		int[] dicesArray = new int[6];
		for (int d : dices) {
			dicesArray[d - 1] += 1;
		}

		int score = nmrOccurence == 1 ? (Arrays.equals(dicesArray, SMALL_STRAIGHT) ? 15 : 0)
				: (nmrOccurence == 5 && Arrays.equals(dicesArray, LARGE_STRAIGHT) ? 20 : 0);
		return score;
	}

}
