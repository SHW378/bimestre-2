public class App {
    public static void main(String[] args) throws Exception {
        //condicionales
        double x = 100;
        double f = 0;
        // Si x es mayor a 0, hacer f igual a x al cuadrado
        //si no, si x es mayor a 0, hacer f igual a x al ciadrado
        //Si no, entonces hacer f igual al valor avsoluto de x
        if  (x > 100) { //bloque de setencia condocional
            f = Math.pow(x, 3);
        } else if (x > 0) {
            f = x * x;
        } else { 
            f = Math.abs(x);
        } //fin de bloque de sentencia condicionañ
        System.out.println("El valor es: " + f);
        //condicionales
    }
}
