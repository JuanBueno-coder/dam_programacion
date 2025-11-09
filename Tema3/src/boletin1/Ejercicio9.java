package boletin1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Dame un numero y te mostrare la magia");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        divisoresPrimos(numero);
        sc.close();
    }
    
    public static void divisoresPrimos(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}