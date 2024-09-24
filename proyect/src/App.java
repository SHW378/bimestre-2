public class App {
    public static void main(String[] args) throws Exception {
        double A = 2;
        double B = 3;
        double C = 4;

        double D = Math.pow(B, 2)-4*A*C;
        double AA = 2*A;
        if (D > 0) {
            double DD = Math.sqrt(D);
            double x1 = (-B+DD)/AA;
            double x2 = (-B-DD)/AA;
            System.out.println("La ecuación tiene raíces reales :" + x1 + x2);
        } else {
            double DD = Math.sqrt(-D);
            double Re = B/AA;
            double Im = DD/AA;
            System.out.println("la ecuacuón tiene raíces complejas conjugadas:");
            System.out.println("Parte real: " + Re);
            System.out.println("Parte imaginaria: " + Im);
        }
        


    }
}
