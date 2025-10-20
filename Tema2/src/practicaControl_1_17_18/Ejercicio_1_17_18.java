package practicaControl_1_17_18;

import java.util.Scanner;

public class Ejercicio_1_17_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreEqMaxRendimiento = "";
		float rendimientoMax = Float.MIN_VALUE;
		float maxFichaMenos7 = Float.MIN_VALUE;
		String nombreJMaxMenos7 = "";
		
		int sumaEdadesF = 0;
		int contF = 0;
		System.out.println("Equipo: ");
		String nombreEquipo =sc.next();
		while(!nombreEquipo.equals("fin")) {
			System.out.println("Puntos: ");
			int puntos =sc.nextInt();
			
			System.out.println("Número de jugadores: ");
			int numJugadores = sc.nextInt();
			
			for(int i =0;i<numJugadores; i++) {
				System.out.println("Nombre: ");
				String nombreJugador = sc.next();
				System.out.println("Edad: ");
				int edad = sc.nextInt();
				System.out.println("Precio ficha: ");
				float precio = sc.nextFloat();
				if (numJugadores<7 && precio>maxFichaMenos7) {
					maxFichaMenos7 = precio;
					nombreJMaxMenos7 = nombreJugador;
				}
			}
			System.out.println("Letra posición: ");
			char letraPosicion = sc.next().charAt(0);
			switch(letraPosicion) {
			case 'D':
				System.out.println("Número de goles marcados: ");
				int numGolesMarcados = sc.nextInt();
				break;
			case 'P':
				System.out.println("Número de goles encajados: ");
				int numGolesEncajados =sc.nextInt();
				break;
			case 'F':
				contF++;
				break;
			}
		}
		System.out.println("Equipo: ");
		nombreEquipo = sc.next();
	}

}
