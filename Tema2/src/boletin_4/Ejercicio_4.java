package boletin_4;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
		System.out.println("Número de región del que se van a introducir datos.");
		Scanner sc = new Scanner(System.in);
		int numRegion = sc.nextInt();
		int provincia = 0;
		String nombreProvincia = "";
		
		int numeroVotosA = 0;
		int numeroVotosB = 0;
		int abstenciones = 0;
		int votosTotales = 0;
		
		String ProvinciaAFavorita = "";
		String ProvinciaBFavorita = "";
		
		int mayorVotosB = Integer.MIN_VALUE;
		int mayorVotosA = Integer.MIN_VALUE;
		
		boolean altaAbstencion =false;
		
		switch (numRegion) {
		case 1:
			provincia = 10;
			break;
		case 2:
			provincia = 4;
			break;
		case 3:
			provincia = 6;
		case 4:
			provincia =1;
		default:System.out.println("No has introducido un numero valido.");
			break;
		}
		for (int i = 1; i <= provincia; i++) {
			
			System.out.println("Dame el nombre de la provincia");
			nombreProvincia = sc.next();
			
			
			System.out.println("¿Número de votos obtenidos por el partido A?");
			numeroVotosA = sc.nextInt();
			
			if(numeroVotosA>mayorVotosA) {
				mayorVotosA = numeroVotosA;
				ProvinciaAFavorita =nombreProvincia;
			}
				
			System.out.println("¿Número de votos obtenidos por el partido B?");
			numeroVotosB = sc.nextInt();
			if(numeroVotosB>mayorVotosB) {
				mayorVotosB = numeroVotosB;
				ProvinciaBFavorita =nombreProvincia;
			}
			
			System.out.println("¿Número de abstenciones?");
			abstenciones =sc.nextInt();
			if(abstenciones>100000)altaAbstencion=true;
		}
		 votosTotales= numeroVotosA+numeroVotosB;
		System.out.println("Porcentaje de votos totales: "+ (votosTotales*100)/votosTotales+abstenciones);
		System.out.println("Porcentaje de abstenciones: "+(((votosTotales*100)/votosTotales+abstenciones)-100)+"%");
		System.out.println("El partido A obtenido mas votos en: "+ProvinciaAFavorita);
		System.out.println("El partido B obtenido mas votos en: "+ProvinciaBFavorita);
		if (altaAbstencion) System.out.println("Alta abstención");
		
		sc.close();
	}

}
