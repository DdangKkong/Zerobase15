import java.util.ArrayList;
import java.util.Scanner;

public class WW3java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> qu = new ArrayList<>();
        ArrayList<Integer> qu2 = new ArrayList<>();
        int result = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            qu.add(sc.nextInt());
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
                result += qu.get(i)^qu.get(j);
            }
            qu.remove(0);
            n--;
            i = -1;
        }

        System.out.println(result);
    }
}
