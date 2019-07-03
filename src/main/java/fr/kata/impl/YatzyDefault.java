package fr.kata.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import fr.kata.YatzyStrategy;

public class YatzyDefault implements YatzyStrategy {
	
	static final int[] SMALL_STRAIGHT = { 1, 1, 1, 1, 1, 0 };
	static final int[] LARGE_STRAIGHT = { 0, 1, 1, 1, 1, 1 };

	List<Integer> dices = new ArrayList<Integer>();

	int nmrOccurence = 0;

	public YatzyDefault(int nmrOccurence, int... dices) {
		super();
		this.dices = Arrays.stream(dices).boxed().collect(Collectors.toList());
		this.nmrOccurence = nmrOccurence;
	}

	@Override
	public int getScore() {
		return dices.stream().distinct().count()<=1 ? 50 : 0;
	}

}
