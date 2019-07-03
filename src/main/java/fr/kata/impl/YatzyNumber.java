package fr.kata.impl;

public class YatzyNumber extends YatzyDefault {

	public YatzyNumber(int nmrOccurence, int... dices) {
		super(nmrOccurence, dices);
	}

	@Override
	public int getScore() {
		return dices.stream().filter(i -> i == nmrOccurence).mapToInt(i -> i).sum(); 
	}

}
