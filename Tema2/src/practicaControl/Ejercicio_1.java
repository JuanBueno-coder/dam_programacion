package practicaControl;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		String codigo = "";
		String departamento ="";
		String departamentoMax="";
		int numProfesores =0;
		int numProfesoresMax= Integer.MIN_VALUE;
		String clase ="";
		int notaMedia;
		int notaMediaMax = Integer.MIN_VALUE;
		String alumnoSupremo ="";
		
		String Especialidad1;
		String Especialidad2;
		int numAsignaturas;
		
		System.out.println("introduce las unidad a la que perteneces, si quieres salir simplemente escribe 'fin'");
		Scanner sc = new Scanner(System.in);
		codigo = sc.nextLine();
		while(!codigo.equalsIgnoreCase("fin")) {
			if(codigo.charAt(0)=='D') {
				System.out.println("Introduce el nombre del departamento");
				departamento =sc.nextLine();
				System.out.println("Introduce el número de profesores que tiene");
				numProfesores = sc.nextInt();
				
				if(numProfesores>numProfesoresMax) {
					numProfesoresMax = numProfesores;
					departamentoMax = departamento;
				}
				
				
				for (int i = 1; i <= numProfesores; i++) {
					System.out.println("Nombre del profesor "+i);
					String nombreProfesor=sc.nextLine();
					System.out.println("Número de años que lleva ejerciendo");
					int permanenciaCentro = sc.nextInt();
				}
			}else {
				System.out.println("Introduce la inicial de tu curso: E, P, B o F; dependiendo de si la clase es de\r\n"
						+ "ESO, PCPI, Bachillerato o FP.");
				clase =sc.nextLine();
				switch (clase) {
				case "E":
					System.out.println("Dame nombres de alumno cuando quieras parar di, fin.");
					String nombreAlumno = sc.nextLine();
					while(!nombreAlumno.equalsIgnoreCase("fin")) {
						System.out.println("¿Nota media del curso?");
						notaMedia =sc.nextInt();
						if (notaMedia>notaMediaMax) {
							notaMediaMax = notaMedia;
							alumnoSupremo =nombreAlumno;
						}
						System.out.println("Dame nombre de alumno cuando quieras parar di, fin.");
						nombreAlumno = sc.nextLine();
					}
					break;
				case "P":
					System.out.println("¿Nombre de la especialidad?");
					Especialidad1 = sc.nextLine();
					break;
				case "B":
					System.out.println("¿Número de asignaturas que tiene?");
					numAsignaturas = sc.nextInt();
				case "F":
					System.out.println("Nombre del titulo");
					System.out.println("Horas del ciclo");
				default:
					break;
				}
			}
		}
		System.out.println("El departamento con mas profesores es:"+departamentoMax);
		System.out.println();
	}

}
