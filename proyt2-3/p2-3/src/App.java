public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 3;
        int num2 = 2;
        int num3 = 5;

        if (num1 > num2)
            if (num2 > num3) {
            System.out.println(num3);
            } else {
                System.out.println(num2);
            } else if (num1 > num3) {
                System.out.println(num3);
            } else {
                System.out.println(num1);
            }
    }
}
