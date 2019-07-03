package fr.kata.impl;

public class YatzyChance extends YatzyDefault {

	public YatzyChance(int nmrOccurence, int ... dices) {
		super(nmrOccurence, dices);
	}

	public int getScore() {
		return dices.stream().reduce(0, Integer::sum);
	}

}
