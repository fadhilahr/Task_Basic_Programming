package com.sti.bootcamp.basic.dua;

public class Soal1 {
	 public static void main(String[]args) {
		 
		 System.out.println(getBilangan(-1));
	 }
	
/*1.
	terdapat sebuah deret bilangan 1,3,5,7,9,11,13,15,17,dst

	buat sebuah function yang mengembalikan angka yang
	diminta (merupakan bilangan ke-) 
	sesuai dengan parameter. jika parameter <= 0, 
	maka kembalikan 0
	contoh : 
	parameter = 7, jawaban = 13
	parameter = 10, jawaban = 19
	parameter = 3, jawaban = 5
*/

	
	public static int getBilangan (int a) {
		
		int hasil = 1;
		 if (a<=0 ) {
			hasil = 0;
		}
		for (int i = 1 ; i < a; i++) {
			hasil+=2;
			
		}
		return hasil;
	}
	
}
