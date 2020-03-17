package com.sti.bootcamp.basic.dua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Soal2Test {
	Soal2 soal = new Soal2();

	@Test
	void testFactorial5() {
		assertEquals(120, soal.factorial(5));
	}

	@Test
	void testFactorial7() {
		assertEquals(5040, soal.factorial(7));
	}

	@Test
	void testFactorial10() {
		assertEquals(3628800, soal.factorial(10));
	}

}
