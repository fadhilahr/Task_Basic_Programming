package com.sti.bootcamp.basic.dua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Soal3Test {
	Soal3 soal = new Soal3();

	@Test
	void test1() {
		assertEquals(3, soal.getIntegerTerkecil(new int[] {4,5,2,1,6}));
	}

	@Test
	void test2() {
		assertEquals(5, soal.getIntegerTerkecil(new int[] {1, 2, 3, 4}));
	}

}
