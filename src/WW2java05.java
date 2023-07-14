import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class WW2java05 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        String input = sc.nextLine();
//        String input = "7 3";
//        String[] str = input.split(" ");
//        Integer[] nk = new Integer[str.length];
//        for (int i = 0; i < str.length; i++) {
//            nk[i] = Integer.parseInt(str[i]);
//        }
//        int n = nk[0];
//        int k = nk[1];
        int n = 7;
        int k = 3;

//        LinkedList<Integer> list = new LinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        int cnt = 0;
        int x = 0;

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        for (int i = 0; i < n; i++) {
            do {
                for (int j = 1; j <= n; j++) {
                    if (list.contains(j)){
                        cnt++;
                        if (cnt == k) {
                            x = j;
                            cnt = 0;
                            break;
                        }
                    }
                }
            } while(cnt < k);

            list2.add(x);
            list.remove(x-1);
        }

        System.out.print("<");
        for (int i = 0; i < n-1; i++) {
            System.out.print(list2.get(i) + ", ");
        }
        System.out.print(list2.get(n-1) + ">");
    }
}
