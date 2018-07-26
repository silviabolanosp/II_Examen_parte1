package com.cenfotec.examen2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.cenfotec.examen2.Criba;

class CribaTest {
	
	@Test
	public void testLengthOfCriba1() { // No hay numeros primos si mando 0 o 1
		Criba c = new Criba();
		assertEquals(0, c.generaCriba(0).length);
		assertEquals(0, c.generaCriba(1).length);
	}

	
	@Test
	public void testToStringCriba1() { // Devuelve un array vacio si mando 0 o 1
		Criba c = new Criba();
		assertEquals("[]", Arrays.toString(c.generaCriba(0)));
		assertEquals("[]", Arrays.toString(c.generaCriba(1)));
	}
	
	@Test
	public void testLengthOfCriba2() { // Devuelve 4 numeros primos si mando 7,8,9 o 10
		Criba c = new Criba();
		assertEquals(4, c.generaCriba(7).length);
		assertEquals(4, c.generaCriba(8).length);
		assertEquals(4, c.generaCriba(9).length);
		assertEquals(4, c.generaCriba(10).length);
	}

	@Test
	public void testToStringCriba2() { // Devuelve un array con 4 variables si mando 7,8,9 o 10
		Criba c = new Criba();
		assertEquals("[2, 3, 5, 7]", Arrays.toString(c.generaCriba(7)));
		assertEquals("[2, 3, 5, 7]", Arrays.toString(c.generaCriba(8)));
		assertEquals("[2, 3, 5, 7]", Arrays.toString(c.generaCriba(9)));
		assertEquals("[2, 3, 5, 7]", Arrays.toString(c.generaCriba(10)));
	}

}
