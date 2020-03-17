package com.sti.bootcamp.basic.dua;

import java.util.Arrays;



public class Soal3 {
	public static void main(String[]args) {
		
		
	}
	
	public static int getIntegerTerkecil(int[] a) {
		
		Arrays.sort(a);
		int counter= 1;
		for (int i = 0; i < a.length; i++) {
			if (counter==a[i]) {
				counter++;
			}
		}
		
	return counter;	
	}
	
}


