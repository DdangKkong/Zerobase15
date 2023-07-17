import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class WW2java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

            do {
                for (int j = 1; j <= n; j++) {
                    if (list.contains(j)){
                        cnt++;
                        if (cnt == k) {
                            cnt = 0;
                            list2.add(j);
                            list.set(j-1, 0);
                        }
                    }
                }
            } while(list2.size() < n);

        System.out.print("<");
        for (int i = 0; i < n-1; i++) {
            System.out.print(list2.get(i) + ", ");
        }
        System.out.print(list2.get(n-1) + ">");
    }
}
