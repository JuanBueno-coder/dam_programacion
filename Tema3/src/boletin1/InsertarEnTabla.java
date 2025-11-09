package boletin1;

import java.util.Arrays;

public class InsertarEnTabla {
	public static void main(String[] args) {
		int [] t = {5, 10, 15, 20, 25, 30};
		int numElem = 6;
		int pos = Arrays.binarySearch(t, 24);
		int posInsercion=0;
		if (pos<0) {
			posInsercion =-pos-1;
		}
		int []tNueva= Arrays.copyOf(t, numElem+1);
		for(int i=tNueva.length-1; i>posInsercion; i--) {
			tNueva[i] = t[i-1];
		}
		t[posInsercion]=4;
		
		System.out.println(tNueva);
		System.out.println(posInsercion);
	}

}
