package com.sti.bootcamp.basic.dua;

public class Soal5 {
	public static void main(String[]args) {
		 
		 System.out.println(jualTiket(10));
	 }
	

	public static int jualTiket (int tiket) {
		
		int counter = 0;
		while (tiket>0) {
			tiket-=6;
			counter ++;
		}
		
		
	return counter;	
	}
		
 
}
