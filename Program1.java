import java.util.Scanner;

public class Program1 {
    public static void main(String args[]) {
        Program1 program1 = new Program1();

        Scanner s = new Scanner(System.in);
        double a, b;
        a = s.nextDouble();
        b = s.nextDouble();
        String operation = s.nextLine();

        double result = program1.Calculator(a, b, operation.trim());
        System.out.println(a);
        System.out.println(b);
        System.out.println(operation);

        System.out.println(result);
    }

    public double Calculator(double a, double b, String operation) {
        double result = 0.0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                }
                break;
            default:
                result = 0.0;
        }

        return result;
    }
}