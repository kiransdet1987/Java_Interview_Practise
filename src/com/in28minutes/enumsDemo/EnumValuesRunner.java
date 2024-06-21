package com.in28minutes.enumsDemo;

import java.util.Arrays;

enum Seasons {
	WINTER(1), SPRING(2), SUMMER(3), FALL(4);

	private int value;

	private Seasons(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class EnumValuesRunner {

	public static void main(String[] args) {

		Seasons season = Seasons.FALL;

		Seasons season1 = Seasons.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(Seasons.SPRING.ordinal());
		System.out.println(Seasons.SPRING.getValue());

		System.out.println(Arrays.toString(Seasons.values()));

	}


}
