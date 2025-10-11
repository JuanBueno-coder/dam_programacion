package boletin_4;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		System.out.println("Número de región del que se van a introducir datos.");
		Scanner sc = new Scanner(System.in);
		int numRegion = sc.nextInt();
		int provincia = 0;
		String nombreProvincia = "";
		
		numeroVotosA=0;
		numeroVotosB=0;
		
		switch (numRegion) {
		case 1:
			provincia = 10;
			break;
		case 2:
			provincia = 4;
			break;
		case 3:
			provincia = 6;
		case 4:
			provincia =1;
		default:System.out.println("No has introducido un numero valido.");
			break;
		}
		for (int i = 1; i < provincia; i++) {
			System.out.println("Dame el nombre de la provincia");
			nombreProvincia = sc.next();
			System.out.println("¿Número de votos obtenidos por el partido A?");
		}
		
		
		
		
		
		sc.close();
	}

}
