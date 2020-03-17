package com.sti.bootcamp.basic.dua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Soal1Test {
	Soal1 soal = new Soal1();

	@Test
	void testGetDeret7() {
		assertEquals(13, soal.getBilangan(7));
	}

	@Test
	void testGetDeret10() {
		assertEquals(19, soal.getBilangan(10));
	}

	@Test
	void testGetDeret3() {
		assertEquals(5, soal.getBilangan(3));
	}

	@Test
	void testGetDeret0() {
		assertEquals(0, soal.getBilangan(0));
	}

	@Test
	void testGetDeretMin1() {
		assertEquals(0, soal.getBilangan(-1));
	}

	@Test
	void testGetDeret300() {
		assertEquals(599, soal.getBilangan(300));
	}

}
