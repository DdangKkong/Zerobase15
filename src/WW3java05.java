import java.util.LinkedList;
import java.util.Scanner;

public class WW3java05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = sc.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        int v = sc.nextInt();
        sc.nextLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(v == list.poll()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
