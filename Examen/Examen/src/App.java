import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean salida = true;
        Scanner scanner = new Scanner(System.in);
        while (salida) {
        System.out.println("Ingrese el símbolo de la operación S, (+, -, *, /) o  'f' para salir");
        char operacion = scanner.next().charAt(0);
        if  (operacion == 'f') {
            System.out.println("Programa finalizado");
            salida = false; 
        }
        if (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/') {
            System.out.println("El operador no es válido. Intente de nuevo o finalizar el programa.");
        }
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        switch (operacion) {
            case '+':
                System.out.println("El resultado es: " + (a + b));
                break;
            case '-':
                System.out.println("El resultado es: " + (a - b));
                break;
            case '*':
                System.out.println("El resultado es: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    if (a == 0) {
                        System.out.println("El resultado es: indeterminación");
                    } else {
                        System.out.println("El resultado es: infinito");
                    }
                } else {
                    System.out.println("El resultado es: " + (a / b));
                }
                break;
            }
        }
        scanner.close();
    }
}
