package practicaControl_18_19;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // =====================================================
        // DECLARACIÓN DE VARIABLES
        // =====================================================
        
        // Apartado a) - Clase con más aprobados
        String claseConMasAprobados = "";
        int maxAprobadosEnClase = Integer.MIN_VALUE;
        
        // Apartado b) - Tutor con menor % suspensos
        String tutorMejorClase = "";
        double maxPorcentajeAprobados = Double.MIN_VALUE;
        
        // Apartado c) - Clases con más aprobados que suspensos
        int clasesConMasAprobadosQueSuspensos = 0;
        
        // Apartado d) - Alumnos con examen final aprobado
        int alumnosTotales = 0;
        int alumnosConExamenAprobado = 0;
        
        // Apartado e) - Tres primeros con control aprobado
        boolean hayClaseConTresPrimerosAprobados = false;
        
        // =====================================================
        // ENTRADA DE DATOS
        // =====================================================
        
        System.out.println("Introduce el nombre de la clase (fin para terminar):");
        String nombreClase = sc.next();
        
        while (!nombreClase.equals("fin")) {
            
            // --- Datos de la clase ---
            System.out.println("Nombre del tutor:");
            String nombreTutor = sc.next();
            
            // Contadores de esta clase específica
            int alumnosEnClase = 0;
            int aprobadosEnClase = 0;
            boolean losTresPrimerosAprobaron = true;
            
            // --- Bucle de alumnos de esta clase ---
            System.out.println("Nombre del alumno (fin para terminar):");
            String nombreAlumno = sc.next();
            
            while (!nombreAlumno.equals("fin")) {
                alumnosEnClase++;
                alumnosTotales++;
                
                // Pedir notas
                System.out.println("Nota del control:");
                int notaControl = sc.nextInt();
                
                System.out.println("Nota del examen final:");
                int notaExamen = sc.nextInt();
                
                System.out.println("Nota de clase:");
                int notaClase = sc.nextInt();
                
                // Calcular nota global
                double notaGlobal = (notaExamen * 0.6) + (notaControl * 0.3) + (notaClase * 0.1);
                
                // Apartado a) - Contar aprobados en nota global
                if (notaGlobal >= 5.0) {
                    aprobadosEnClase++;
                }
                
                // Apartado d) - Contar aprobados en examen final
                if (notaExamen >= 5) {
                    alumnosConExamenAprobado++;
                }
                
                // Apartado e) - Verificar si los 3 primeros tienen control aprobado
                if (alumnosEnClase <= 3 && notaControl < 5) {
                    losTresPrimerosAprobaron = false;
                }
                
                System.out.println("Nombre del alumno (fin para terminar):");
                nombreAlumno = sc.next();
            }
            
            // --- Procesamiento al finalizar cada clase ---
            
            // Apartado a) - ¿Es la clase con más aprobados?
            if (aprobadosEnClase > maxAprobadosEnClase) {
                maxAprobadosEnClase = aprobadosEnClase;
                claseConMasAprobados = nombreClase;
            }
            
            // Apartado b) - Calcular % de aprobados
            double porcentajeAprobados = (aprobadosEnClase * 100.0) / alumnosEnClase;
            if (porcentajeAprobados > maxPorcentajeAprobados) {
                maxPorcentajeAprobados = porcentajeAprobados;
                tutorMejorClase = nombreTutor;
            }
            
            // Apartado c) - ¿Hay más aprobados que suspensos?
            int suspensosEnClase = alumnosEnClase - aprobadosEnClase;
            if (aprobadosEnClase > suspensosEnClase) {
                clasesConMasAprobadosQueSuspensos++;
            }
            
            // Apartado e) - ¿Los 3 primeros aprobaron el control?
            if (alumnosEnClase >= 3 && losTresPrimerosAprobaron) {
                hayClaseConTresPrimerosAprobados = true;
            }
            
            System.out.println("Introduce el nombre de la clase (fin para terminar):");
            nombreClase = sc.next();
        }
        
        // =====================================================
        // CÁLCULOS FINALES
        // =====================================================
        
        double porcentajeSuspensosMenor = 100 - maxPorcentajeAprobados;
        double porcentajeExamenAprobado = (alumnosConExamenAprobado * 100.0) / alumnosTotales;
        
        // =====================================================
        // SALIDA DE RESULTADOS
        // =====================================================
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("a) Clase con más aprobados: " + claseConMasAprobados);
        System.out.println("b) Tutor con menor % suspensos: " + tutorMejorClase + " (" + porcentajeSuspensosMenor + "%)");
        System.out.println("c) Clases con más aprobados que suspensos: " + clasesConMasAprobadosQueSuspensos);
        System.out.println("d) % alumnos con examen final aprobado: " + porcentajeExamenAprobado + "%");
        
        if (hayClaseConTresPrimerosAprobados) {
            System.out.println("e) Los tres primeros alumnos de una clase aprobaron el control");
        }
        
        sc.close();
    }
}