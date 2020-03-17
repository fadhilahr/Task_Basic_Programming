package com.sti.bootcamp.basic.dua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Soal5Test {
	Soal5 bioskop = new Soal5();
	
	@Test
	void test10() {
		assertEquals(2, bioskop.jualTiket(10));
	}
	
	@Test
	void test20() {
		assertEquals(4, bioskop.jualTiket(20));
	}

}
