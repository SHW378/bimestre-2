public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        
        if (num1 > num2 && num1 > num3) {
        System.out.println(num1);
    } else if (num2 > num3) {
        System.out.println(num2);
    } else {
        System.out.println(num3);
    }
    }
}
