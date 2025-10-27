package examen;

import java.util.Scanner;

public class Examen {
	public static void main(String[] args) {
		
		System.out.println("Dime la cantidad total de investigadores que se embarcan");
		Scanner sc = new Scanner (System.in);
		
		int numInvestigadores = sc.nextInt();
		
		int sumaNoches= 0;
		int contExpedicion = 0;
		int contMiskatonic = 0;
		int contchullu = 0;
		int contindependiente =0;
		int maxindEnergia = Integer.MIN_VALUE;
		String invesMaxEnergia ="";
		int codMaxEnergia =0;
		int nochesMayoresTres =0;
		double promedio =0;
		
		double nochesPorcentaje =0;
		int minNivelCult =Integer.MAX_VALUE;
		int segundomenorNivelCutl =0;
		

		
		for (int i = 0; i < numInvestigadores; i++) {
			System.out.println("Dame el nombre del "+i+" invetigador");
			String investigador =sc.next();
			if(investigador.charAt(0)=='M') {
				contMiskatonic++;
			}
			if(investigador.charAt(0)=='C') {
				contchullu++;
			}
			if(investigador.charAt(0)=='E') {
				contindependiente++;
			}
			System.out.println("Dime el lugar explorado");
			String lugar = sc.next();
			System.out.println("Introduce el codigo de expedición -1 si quieres finalizar");
			
			int codigo =sc.nextInt();
			while (codigo>-1) {
				System.out.println("número de noches de registro");
				int noches =sc.nextInt();
				contExpedicion++;
				
				sumaNoches+=noches;
				
				if (noches>3) {
					nochesMayoresTres++;
				}
				
				for (int j = 0; j < noches; j++) {
					System.out.println("¿Nivel de cordura restante?");
					int cordura = sc.nextInt();
					System.out.println("¿Indice de actividad cultista?");
					int indCult = sc.nextInt();
					if (minNivelCult>indCult) {
						segundomenorNivelCutl = minNivelCult;
						minNivelCult =indCult;
					}
					System.out.println("¿Nivel de energia cosmica consumida?");
					int indEnergia =sc.nextInt();
					if(indEnergia>maxindEnergia ) {
						maxindEnergia = indEnergia;
						invesMaxEnergia =investigador;
						codMaxEnergia =codigo;
					}
					
				}
				// 200---- 100
				//25--x
				
				
				
				
				System.out.println("Introduce el codigo de expedición -1 si quieres finalizar");
				codigo =sc.nextInt();
			}
			promedio = sumaNoches/contExpedicion;
		}
		

		nochesPorcentaje = (100*nochesMayoresTres)/sumaNoches;
		if(contchullu>=1 && contindependiente>=1 && contMiskatonic>=1) {
			System.out.println("Han participado investigadores de las tres procedencias");
		}
		System.out.println("El investigador que registró la mayor cantidad de energia cosmica es:"+invesMaxEnergia+ "con el nivel: "+maxindEnergia+" y el codigo "+codMaxEnergia);
		System.out.println("Los dos niveles mas bajos cultistas registrados son: "+minNivelCult+" y "+segundomenorNivelCutl );
		
		System.out.println("Numero promedio que dura una investigación"+promedio);
		System.out.println("El porcentaje de noches mayores de tres son: "+nochesPorcentaje );
		sc.close();
	}

}
