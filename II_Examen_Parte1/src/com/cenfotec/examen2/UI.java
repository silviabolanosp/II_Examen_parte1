package com.cenfotec.examen2;

import java.util.Arrays;

public class UI {
	public static void main(String[] args) {
		Criba c = new Criba();
		System.out.println(c.generaCriba(8).length);
		System.out.println(Arrays.toString(c.generaCriba(8)));
		int[] criba = c.generaCriba(8);
		for (int i = 0; i < c.generaCriba(8).length; i++) {
			System.out.println(criba[i]);
		}

	}
}
