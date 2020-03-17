package com.sti.bootcamp.basic.dua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Soal4Test {
	Soal4 soal4 = new Soal4();
	
	@Test
	void test1() {
		int[] asli = new int[] {4, 6, 3, 7, 1, 9};
		int[] sorted = new int[] {1, 3, 4, 6, 7, 9};
		
		assertArrayEquals(sorted, soal4.sortInteger(asli));
	}

	@Test
	void test2() {
		int[] asli = new int[] {2, 1, 5, 2, 4, 3};
		int[] sorted = new int[] {1, 2, 2, 3, 4, 5};
		
		assertArrayEquals(sorted, soal4.sortInteger(asli));
	}

	@Test
	void test3() {
		int[] asli = new int[] {2, 1, 5, 2, 4, 3, 4, 6, 3, 7, 1, 9};
		int[] sorted = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 9};
		
		assertArrayEquals(sorted, soal4.sortInteger(asli));
	}

}
