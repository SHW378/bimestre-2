import java.util.Scanner;
 
public class EjemploReducido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingresa un número entero: ");
        int entero = scanner.nextInt();
 
        System.out.print("Ingresa un número decimal: ");
        double decimal = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer
 
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
 
        System.out.println("Entero: " + entero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Texto: " + texto);
 
        scanner.close();
    }
}