package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		System.out.println("Dame una palabra ");
		Scanner sc = new Scanner(System.in);
		String entrada =sc.next();
		if (esVocal(entrada)) {
			System.out.println("Es vocal");
		}else {
			System.out.println("No es vocal");
		}
		sc.close();
	}
	
	
	public static boolean esVocal(String palabra) {
		boolean esVocal =true;
		if (palabra.charAt(0)=='a') {
			esVocal = true;
		}else if (palabra.charAt(0)=='e'){
			esVocal = true;
		}else if(palabra.charAt(0)=='i') {
			esVocal = true;
		}else if(palabra.charAt(0)=='o') {
			esVocal = true;
		}else if(palabra.charAt(0)=='u') {
			esVocal = true;
		}else {
			esVocal =false;
		}
		
		return esVocal;
	}
}
