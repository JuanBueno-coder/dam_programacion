package boletin_4;

import java.util.Scanner;

public interface Ejercicio_3 {
	public static void main(String[] args) {
		System.out.println("Dame un número del mes");
		System.out.println(3*5*7*9*11*13*15*17*19*21);

		int numMes = 0;
		Scanner sc = new Scanner(System.in);
		numMes = sc.nextInt();
		int diaMasPiezas =0;
		int piezas =0;
		int diaMenosPiezas = 0;
		int dias = 0;
		int motores = 0;
		switch (numMes) {
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
		case 4, 6, 9, 11:
			dias =30;
		case 2:
			dias =28;
		default:
			System.out.println("Número no valido.");

		}
		for (int i = 1; i <= dias; i++) {
			
			System.out.println("Dime el número de piezas que se han fabricado");
			piezas = sc.nextInt();
			
		}
		sc.close();
		
	}
}
