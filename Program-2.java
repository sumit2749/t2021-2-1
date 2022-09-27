import java.util.Scanner;

public class Program2 {
    public static void oddNumber(int n) {
        System.out.print("Numbers are: ");
        for (int i = 1; i <= 2 * n; i = i + 2) {
            System.out.print(i + ",");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        oddNumber(n);
    }
}
