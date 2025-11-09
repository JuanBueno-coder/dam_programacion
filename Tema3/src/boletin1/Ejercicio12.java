package boletin1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.println("Introduce un numero para calcular su factorial");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println(factorial(num1));
		
		sc.close();
	}
	public static int factorial(int numero) {
		if(numero==0) {
			return 1;
		}
		
		
		return numero*factorial(numero-1);
	}

}
