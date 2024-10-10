import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificacion = 0;
        boolean salida = false;
       while (!salida){
            System.out.println("Menu: ");
            System.out.println("""
                     1. Ingresar calificacion, valorar la califacion y si es aprobatoria o reprobatoria
                     2. Salir
                     Seleccione una opcion:\s
                    \s""");
            int decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Ingrese una calificacion numerica (0-100): ");
                    calificacion = scanner.nextDouble();
                    if (calificacion <= 100 && calificacion >= 0) {
                        if (calificacion <= 20) {
                            System.out.println("El alumno obtuvo " + calificacion + " y su desempeno fue muy malo");

                        } else if (calificacion >= 21 && calificacion <= 40) {
                            System.out.println("El alumno obtuvo " + calificacion + " y su desempeno fue malo");

                        } else if (calificacion >= 41 && calificacion <= 60) {
                            System.out.println("El alumno obtuvo " + calificacion + " y su desempeno fue regular");

                        } else if (calificacion >= 61 && calificacion <= 80) {
                            System.out.println("El alumno obtuvo " + calificacion + " y su desempeno fue bueno");

                        } else if (calificacion >= 81) {
                            System.out.println("El alumno obtuvo " + calificacion + " y su desempeno fue muy bueno");
                        }
                        if (calificacion >= 70) {
                            System.out.println("La calificacion es aprobatoria.");
                        } else {
                            System.out.println("La calificacion es reprobatoria.");
                        }
                    } else {
                        System.out.println("Calificacion invalida, Debe estar entre 0 y 100");
                    }
                    break;
                case 2:
                    scanner.close();
                    System.out.println("Saliendo del programa...");
                    salida = true;
            }
        }
    }
}
