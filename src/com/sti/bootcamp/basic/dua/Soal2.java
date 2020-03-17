package com.sti.bootcamp.basic.dua;

public class Soal2 {
	public static void main(String[]args) {
		 
		 System.out.println(factorial(10));
	 }

	
	/*factorial merupakan hasil perkalian sebuah bilangan dengan bilangan2 sebelum nya yang lebih dari nol

	buat sebuah function yang mengembalikan 
	hasil factorial dari sebuah angka dari parameter
	contoh :
	parameter 5, jawaban ==> 5x4x3x2x1 = 120
	parameter 7, jawaban ==> 7x6x5x4x3x2x1 = 5040
*/
	public static int factorial(int b) {
		
		int hasil = 1;
		for (int i = 1; i <= b; i++) {
			hasil*=i;
			
		}
		return hasil ;
	}

}
