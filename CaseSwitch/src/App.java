public class App {
    public static void main(String[] args) throws Exception {
        int a = 12;
        int b = 3;
        char s = '%';

        switch (s) {
            case '+':
                System.out.println("El resultado es = "+ (a+b));
                break;
            case '-':
                System.out.println("El resultado es = "+ (a-b));
                break;
            case '*':
                System.out.println("El resultado es = "+ (a*b));
                break;
            case '/':
                if  (a == 0) {
                    System.out.println("El resuktadi es = Indeterminado");    
                } else if (b == 0) {
                    System.out.println("El resultado es = Infinito");
                } else {
                    System.out.println("El resultado es = "+ (a/b));
                }
                break;
            default: 
                System.out.println("El operador no se reconoce");
                break;
        }       
    }
}
