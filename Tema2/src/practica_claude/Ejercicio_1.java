package practica_claude;

import java.util.Scanner;

public class Ejercicio_1 {
	//EJERCICIO BÁSICO ⭐⭐
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de ventas a introducir: ");
		int ventas = sc.nextInt();
		float precio = 0;
		float totalIngresos =0;
		int contSwtich =0;
		int contPc = 0;
		int contPs5 = 0;
		int contXbox =0;
		String mejorPlataforma ="";
		for (int i = 0; i < ventas; i++) {
			
			System.out.println("¿Nombre del juego?");
			String nomJuego = sc.next();
			
			System.out.println("¿Plataforma del juego?");
			String nomPlataforma = sc.next();
			switch (nomPlataforma) {
			case "PS5": contPs5++;//5
				break;
			case "PC": contPc++;//10
				break;
			case "XBOX": contXbox++;//8
				break;
			case "SWITCH": contSwtich++;//7
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + nomPlataforma);
			}
			
			System.out.println("¿Precio de la venta?");
			precio = sc.nextFloat();
			
			System.out.println("¿Unidades vendidas?");
			int unidadesVendidas = sc.nextInt();
			
			totalIngresos +=precio;
			
			mejorPlataforma = "PC";
			if(contPs5>contPc) mejorPlataforma="PS5";
			if(contSwtich>contPs5) mejorPlataforma ="SWITCH";
			if (contXbox>contSwtich) mejorPlataforma ="XBOX";
		}
		System.out.println("Total ingresos:"+totalIngresos);
		System.out.println("Plataforma con mas ventas"+mejorPlataforma);
		sc.close();
	}

}
