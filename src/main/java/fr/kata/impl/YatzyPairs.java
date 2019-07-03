package fr.kata.impl;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YatzyPairs extends YatzyDefault {

	public YatzyPairs(int nmrOccurence, int ... dices) {
		super(nmrOccurence, dices);
	}

	@Override
	public int getScore() {
		Stream<Integer> stream = dices.stream().filter(i -> Collections.frequency(dices, i) >= 2)
				.collect(Collectors.toSet()).stream();

		return (nmrOccurence == 1 ? stream.collect(Collectors.summarizingInt(Integer::intValue)).getMax()
				: stream.reduce(0, Integer::sum)) * 2;
	}

}
