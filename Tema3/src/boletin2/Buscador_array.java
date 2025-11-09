package boletin2;


public class Buscador_array {
	
	public static void main(String[] args) {
		int[] numeros = {5, 10, 15, 20, 25, 30};
	    
	    int indice = getIndexOf(20, numeros);
	    System.out.println("El índice de 20 es: " + indice);
	    

	    int indiceNoExiste = getIndexOf(99, numeros);
	    System.out.println("El índice de 99 es: " + indiceNoExiste);
	}
	
	
	
	
	
	public static int getIndexOf(int n, int []tabla) {
		boolean encontrada = false;
		int indice =-1;
		
		for (int i = 0; i < tabla.length && encontrada==false; i++) {
			if(tabla[i]==n) {
				indice =i;
				encontrada =true;
			}
		}
		
		
		
		return indice;
	}

}
