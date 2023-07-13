import java.util.Scanner;

public class WW2java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nma = sc.nextLine().split(" ");
        Integer[] NMA = new Integer[nma.length];
        for (int i = 0; i < nma.length; i++) {
            NMA[i] = Integer.parseInt(nma[i]);
        }
        int x = sc.nextInt();
        sc.nextLine();

        int n = NMA[0];
        int m = NMA[1];
        long h = 1L;

        for (int i = 0; i < n-1; i++) {
            h = (m * h) % 1000000007;
        }

        System.out.println(h);
    }
}
