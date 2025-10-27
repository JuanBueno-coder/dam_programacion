package boletin1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("dime dos numeros");
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 = sc.nextInt();
		int resultado=mayor(num1, num2);
		System.out.println(resultado);
		sc.close();
	}
	public static int mayor(int a, int b){
		int c = Math.max(a, b);
		return c;
	}
}
