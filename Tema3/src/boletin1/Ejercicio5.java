package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("dime tres numeros");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        

        int resultado = Comparador.mayorDeTres(num1, num2, num3);
        System.out.println("El mayor de los tres es: " + resultado);
        
        sc.close();
    }
}
