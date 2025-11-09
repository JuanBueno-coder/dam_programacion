package ejercicios_claude;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nombJuego ="";
		int ingresos=0;
		int contPc = 0;
	    int contXbox = 0;
	    int contPs5 = 0;
	    int  contSwitch= 0;
		
		
		System.out.println("Bienvenido a game");
		System.out.println("Introduce el numero de ventas");
		int numVentas =sc.nextInt();
		sc.nextLine();//Buffer
		for(int i =1; i<=numVentas; i++) {
			System.out.println("¿Nombre del Juego?");
			nombJuego = sc.next();
			System.out.println("¿Nomre de la plataforma?");
			String plataforma = sc.next();
			
			switch (plataforma.toUpperCase()) {
			case "PC": 
				contPc++;
				break;
			
			case "XBOX":
				contXbox++;
				break;
			case "PS5":
				contPs5++;
				break;
			case "SWITCH":
				contSwitch++;
				break;
			default:
				System.out.println("Plataforma no válida. No se contará esta venta.");
                break;
			}
			System.out.println("¿Precio?:");
			int precio = sc.nextInt();
			System.out.println("¿Unidades?");
			int unidades =sc.nextInt();
			ingresos += precio*unidades;
		}
		int mayor = contPc;
        String plataformaMayor = "PC";

        if (contXbox > mayor) {
            mayor = contXbox;
            plataformaMayor = "XBOX";
        }

        if (contPs5 > mayor) {
            mayor = contPs5;
            plataformaMayor = "PS5";
        }

        if (contSwitch > mayor) {
            mayor = contSwitch;
            plataformaMayor = "SWITCH";
        }

	}

}
