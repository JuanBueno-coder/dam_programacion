package boletin1;

public class Comparador {
	public static int mayorDeTres(int a, int b, int c) {
        int mayor = Math.max(a, b);
        mayor = Math.max(mayor, c);
        return mayor;
    }

}
