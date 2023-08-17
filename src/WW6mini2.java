/*
        이원우
*/
import java.util.ArrayList;
import java.util.Scanner;

public class WW6mini2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = -1;
        int y = -1;
        boolean z = true;
        while (X.size() < 10) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (X.contains(x)) {
                if (Y.get(X.indexOf(x)) == y) {
                    z = false;
                }
            }
            if (z) {
                X.add(x);
                Y.add(y);
            }
            z = true;
        }
        int min = Integer.MAX_VALUE;
        int minidx = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            X.add(X.remove(0) - a);
            Y.add(Y.remove(0) - b);
            }
        for (int i = 0; i < X.size(); i++) {
            int j = X.get(i) + Y.get(i);
            if (min > j) {
                min = j;
                minidx = i;
            }
        }
        x = X.get(minidx) + a;
        y = Y.get(minidx) + b;
        System.out.print("(" + x + "," + y + ")" );



    }
}
