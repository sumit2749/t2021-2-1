import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4 {
    public static void main(String args[]) {
        Program4 program4 = new Program4();

        int[] a = new int[11];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            String token = scan.next();
            a[i] = Integer.parseInt(token);
        }

        program4.CountDictionary(a);

        // System.out.println(result);
    }

    public void CountDictionary(int[] a) {
        System.out.println(a.length);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= 9; j++) {
                if (a[i] % j == 0) {
                    System.out.println(i + j);

                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }
        }

        // print
        System.out.println(Arrays.asList(map));
    }
}
