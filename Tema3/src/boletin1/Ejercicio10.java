package boletin1;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Dame dos numeros a ver si son amigos");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		if(esAmigo(numero1, numero2)) {
			System.out.println("Son amigos");
		}else {
			System.out.println("No son amigos");
		}
		
		
		
	}
	public static boolean esAmigo(int num1, int num2) {
		
	
		return (sumaDivisores(num1)==num2 && sumaDivisores(num2)==num1);
	}
	public static int sumaDivisores(int n) {
		int sumaD = 0;
		for (int i = 1; i < n; i++) {
			if(n%i==0) {
				sumaD +=i;
			}
			
		}
		return sumaD;
	}
}
