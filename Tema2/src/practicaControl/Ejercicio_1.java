package practicaControl;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String codigo = "";
        
        // Variables para departamentos
        String departamento = "";
        String departamentoMax = "";
        int numProfesores = 0;
        int numProfesoresMax = Integer.MIN_VALUE;
        
        String departamentoMinMedia = "";
        double minMediaAnios = Double.MAX_VALUE;
        
        // Variables para ESO
        String alumnoMejorNota = "";
        double notaMejorAlumno = -1;
        
        // Variables para PCPI
        String especialidad1 = "";
        String especialidad2 = "";
        int contadorPCPI = 0;
        
        // Variables para Bachillerato
        int sumaAsignaturas = 0;
        int contadorBachillerato = 0;
        
        // Variables para FP
        String cicloMenorDuracion = "";
        int menorDuracionFP = Integer.MAX_VALUE;
        int contadorFPMas1500 = 0;
        
        System.out.println("Introduce el código de la unidad (escribe 'fin' para terminar):");
        codigo = sc.nextLine();
        
        while (!codigo.equalsIgnoreCase("fin")) {
            
            if (codigo.charAt(0) == 'D') {
                // Es un DEPARTAMENTO
                System.out.println("Introduce el nombre del departamento:");
                departamento = sc.nextLine();
                
                System.out.println("Introduce el número de profesores:");
                numProfesores = sc.nextInt();
                sc.nextLine();  // Limpiar buffer
                
                if (numProfesores > numProfesoresMax) {
                    numProfesoresMax = numProfesores;
                    departamentoMax = departamento;
                }
                
                int sumaAnios = 0;
                for (int i = 1; i <= numProfesores; i++) {
                    System.out.println("Nombre del profesor " + i + ":");
                    String nombreProfesor = sc.nextLine();
                    
                    System.out.println("Años en el centro:");
                    int anios = sc.nextInt();
                    sc.nextLine();  // Limpiar buffer
                    
                    sumaAnios += anios;
                }
                
                double mediaAnios = (double) sumaAnios / numProfesores;
                if (mediaAnios < minMediaAnios) {
                    minMediaAnios = mediaAnios;
                    departamentoMinMedia = departamento;
                }
                
            } else if (codigo.charAt(0) == 'C') {
                // Es una CLASE
                System.out.println("Introduce el tipo de clase (E, P, B o F):");
                String tipoClase = sc.nextLine();
                
                switch (tipoClase.toUpperCase()) {
                    case "E":
                        // ESO
                        int contadorAlumnos = 0;
                        System.out.println("Introduce nombres de alumnos (escribe 'fin' para terminar):");
                        String nombreAlumno = sc.nextLine();
                        
                        while (!nombreAlumno.equalsIgnoreCase("fin")) {
                            System.out.println("Nota media del alumno:");
                            double notaMedia = sc.nextDouble();
                            sc.nextLine();  // Limpiar buffer
                            
                            contadorAlumnos++;
                            
                            // Solo consideramos grupos de menos de 20 alumnos
                            if (contadorAlumnos < 20 && notaMedia > notaMejorAlumno) {
                                notaMejorAlumno = notaMedia;
                                alumnoMejorNota = nombreAlumno;
                            }
                            
                            System.out.println("Introduce nombre de alumno (escribe 'fin' para terminar):");
                            nombreAlumno = sc.nextLine();
                        }
                        break;
                        
                    case "P":
                        // PCPI
                        System.out.println("Nombre de la especialidad:");
                        String especialidad = sc.nextLine();
                        
                        // Guardamos las dos últimas
                        especialidad2 = especialidad1;
                        especialidad1 = especialidad;
                        contadorPCPI++;
                        break;
                        
                    case "B":
                        // Bachillerato
                        System.out.println("Número de asignaturas:");
                        int numAsignaturas = sc.nextInt();
                        sc.nextLine();  // Limpiar buffer
                        
                        sumaAsignaturas += numAsignaturas;
                        contadorBachillerato++;
                        break;
                        
                    case "F":
                        // FP
                        System.out.println("Nombre del título:");
                        String titulo = sc.nextLine();
                        
                        System.out.println("Horas totales del ciclo:");
                        int horas = sc.nextInt();
                        sc.nextLine();  // Limpiar buffer
                        
                        if (horas > 1500) {
                            contadorFPMas1500++;
                        }
                        
                        if (horas < menorDuracionFP) {
                            menorDuracionFP = horas;
                            cicloMenorDuracion = titulo;
                        }
                        break;
                        
                    default:
                        System.out.println("Tipo de clase no válido");
                        break;
                }
            }
            
            System.out.println("\nIntroduce el código de la unidad (escribe 'fin' para terminar):");
            codigo = sc.nextLine();
        }
        
        // MOSTRAR RESULTADOS
        System.out.println("\n--- RESULTADOS ---");
        
        System.out.println("Departamento con más profesores: " + departamentoMax);
        
        if (!alumnoMejorNota.isEmpty()) {
            System.out.println("Alumno de ESO con mayor nota (grupos < 20): " + alumnoMejorNota);
        } else {
            System.out.println("No hay alumnos de ESO en grupos de menos de 20");
        }
        
        if (contadorPCPI == 0) {
            System.out.println("No se introdujeron especialidades de PCPI");
        } else if (contadorPCPI == 1) {
            System.out.println("Solo hay una especialidad de PCPI: " + especialidad1);
        } else {
            System.out.println("Dos últimas especialidades de PCPI: " + especialidad2 + " y " + especialidad1);
        }
        
        if (contadorBachillerato > 0) {
            double mediaAsignaturas = (double) sumaAsignaturas / contadorBachillerato;
            System.out.println("Media de asignaturas en Bachillerato: " + mediaAsignaturas);
        }
        
        System.out.println("Ciclos de FP con más de 1500 horas: " + contadorFPMas1500);
        
        if (!cicloMenorDuracion.isEmpty()) {
            System.out.println("Ciclo de FP de menor duración: " + cicloMenorDuracion);
        }
        
        if (!departamentoMinMedia.isEmpty()) {
            System.out.println("Departamento con menor media de años: " + departamentoMinMedia);
        }
        
        sc.close();
    }
}