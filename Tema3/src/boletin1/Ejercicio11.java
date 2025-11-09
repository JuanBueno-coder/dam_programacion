package boletin1;

import java.util.Scanner;

public class Ejercicio11 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Calcule a elevado a n, donde a es real, y n entero no negativo");
		System.out.print("Ingrese la base: ");
		int numero1 = sc.nextInt();
		System.out.print("Ingrese el exponente: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Resultado iterativo: " + numeroElevadoIterativo(numero1, numero2));
		System.out.println("Resultado recursivo: " + potencia(numero1, numero2));
		
		sc.close();
	}
	
	public static int numeroElevadoIterativo(int num1, int num2){
		int resultado = 1;
		for (int i = 0; i < num2; i++) {
			resultado *= num1;
		}
		return resultado;
	}
	
	public static int potencia(int base, int exponente) {
		if (exponente == 0) {
			return 1;
		}
		return base * potencia(base, exponente - 1);
	}
}