package fr.kata;

import fr.kata.impl.YatzyChance;
import fr.kata.impl.YatzyDefault;
import fr.kata.impl.YatzyKind;
import fr.kata.impl.YatzyNumber;
import fr.kata.impl.YatzyPairs;
import fr.kata.impl.YatzyStraight;

public class Yatzy {

	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		YatzyStrategy y = new YatzyChance(0, d1, d2, d3, d4, d5);
		return y.getScore();
	}

	public static int yatzy(int... dice) {
		YatzyStrategy y = new YatzyDefault(0, dice);
		return y.getScore();

	}

	public static int ones(int d1, int d2, int d3, int d4, int d5) {
		YatzyStrategy y = new YatzyNumber(YatzyEnum.ONE.getValue(), d1, d2, d3, d4, d5);
		return y.getScore();
	}

	public static int twos(int d1, int d2, int d3, int d4, int d5) {
		YatzyStrategy y = new YatzyNumber(YatzyEnum.TOW.getValue(), d1, d2, d3, d4, d5);
		return y.getScore();
	}

	public static int threes(int d1, int d2, int d3, int d4, int d5) {
		YatzyStrategy y = new YatzyNumber(YatzyEnum.THREE.getValue(), d1, d2, d3, d4, d5);
		return y.getScore();

	}

	protected int[] dice;

	public Yatzy(int d1, int d2, int d3, int d4, int _5) {
		dice = new int[5];
		dice[0] = d1;
		dice[1] = d2;
		dice[2] = d3;
		dice[3] = d4;
		dice[4] = _5;
	}

	public int fours() {
		return YatzyFactory.getInstance(YatzyStrategy.NUMBER_STRATEGY, 
				YatzyEnum.FOR.getValue(), dice).getScore();
		
	}

	public int fives() {
		return YatzyFactory.getInstance(YatzyStrategy.NUMBER_STRATEGY, 
				YatzyEnum.FIVE.getValue(), dice).getScore();
	}

	public int sixes() {
		return YatzyFactory.getInstance(YatzyStrategy.NUMBER_STRATEGY, 
				YatzyEnum.SIXE.getValue(), dice).getScore();
	}

	public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
		return YatzyFactory.getInstance(YatzyStrategy.PAIR_STRATEGY, 
				YatzyEnum.ONE.getValue(), d1, d2, d3, d4, d5).getScore();
	}

	public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
		return YatzyFactory.getInstance(YatzyStrategy.PAIR_STRATEGY, 
				YatzyEnum.TOW.getValue(), d1, d2, d3, d4, d5).getScore();
	}

	public static int four_of_a_kind(int _1, int _2, int d3, int d4, int d5) {
		return YatzyFactory.getInstance(YatzyStrategy.KIND_STRATEGY, 
				YatzyEnum.FOR.getValue(), _1, _2, d3, d4, d5).getScore();
	}

	public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
		return YatzyFactory.getInstance(YatzyStrategy.KIND_STRATEGY, 
				YatzyEnum.THREE.getValue(), d1, d2, d3, d4, d5).getScore();
	}

	public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
		return YatzyFactory.getInstance(YatzyStrategy.STRAIGHT_STRATEGY, 
				YatzyEnum.ONE.getValue(), d1, d2, d3, d4, d5).getScore();
	}

	public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
		return YatzyFactory.getInstance(YatzyStrategy.STRAIGHT_STRATEGY, 
				YatzyEnum.FIVE.getValue(), d1, d2, d3, d4, d5).getScore();
	}

	public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
		int a = YatzyFactory.getInstance(YatzyStrategy.KIND_STRATEGY, 
				YatzyEnum.THREE.getValue(), d1, d2, d3, d4, d5).getScore();
		int b = YatzyFactory.getInstance(YatzyStrategy.PAIR_STRATEGY, 
				YatzyEnum.ONE.getValue(), d1, d2, d3, d4, d5).getScore();
		
		return (a != 0 && b != 0) ? a + b : 0;
	}
}
