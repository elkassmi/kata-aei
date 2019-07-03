package fr.kata.impl;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YatzyKind extends YatzyDefault {

	public YatzyKind(int nmrOccurence, int... dices) {
		super(nmrOccurence, dices);
	}

	@Override
	public int getScore() {
		
		Stream<Integer> stream = dices.stream().filter(i -> Collections.frequency(dices, i) >= nmrOccurence)
		        .collect(Collectors.toSet()).stream();
		return stream.reduce(0, Integer::sum) * nmrOccurence;
	}

}

