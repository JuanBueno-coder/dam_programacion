package boletin1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println("El numero de numeros primos que contiene "+numero+ " es "+numDivisoresPrimos(numero));
		
		sc.close();
	}
	public static int numDivisoresPrimos(int num) {
		
		int numeroDePrimos=0;
		for (int i = 1; i < num; i++) {
			
			if (num%i==0){
				numeroDePrimos++;
			}
		}
		
		
		return numeroDePrimos-1;
	}

}
