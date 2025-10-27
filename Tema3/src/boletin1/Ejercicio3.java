package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime si quieres que te muestre el area(1) o el volumen(2)");
		int opcionUsuario =sc.nextInt();
		System.out.println("Dime el radio");
		float radioUsuario = sc.nextFloat();
		System.out.println("Dime la altura");
		float alturaUsuario =sc.nextFloat();
		areaVolumen(opcionUsuario, radioUsuario, alturaUsuario);
		sc.close();
	}
	public static double areaVolumen(int opcion, float radio, float altura) {
		double res =0;
		if(opcion== 1) {
			res = 2*Math.PI*radio*(altura+radio);
		}else {
			res =Math.PI*Math.pow(radio, 2)*altura;
		}
		
		return res;
	}

}
