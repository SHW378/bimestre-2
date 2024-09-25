public class App {
    public static void main(String[] args) throws Exception {
        double a  = 0;
        double b = 0;
        char s = '+';

        if (s == '+') {
            System.out.println("El resultado es = "+ (a+b));
        } else if (s == '-') {
            System.out.println("El resusltado es = "+ (a-b));
        } else if (s == '*') {
            System.out.println("El resultado es = "+ (a*b));
        } else if (s == '/') {
          if  (b == 0) {
             if (a == 0) {
                System.out.println("El resultado es = NaN (Indeterminación)");
             } else {
                System.out.println("El resultado es= Inf (Infinito)");
             }
            } else {
                 System.out.println("El resultado es= "+ (a/b));
            }
         }
    }
}
