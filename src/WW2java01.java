import java.util.Scanner;

public class WW2java01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        String[] st = input.split(" ");

        Integer[] A = new Integer[st.length];
        for (int i = 0; i < st.length; i++) {
            A[i] = Integer.parseInt(st[i]);
        }

        if (n <= 4) {
            System.out.println("YES");
        }

        int j = 0;
        for (int i = 1; i <= n / 4; i++) {
            j++;
        }

        boolean result = true;
        for (int i = 0; i < j; i++) {
            int search1 = linearSearch(A, n - i);
            if (search1 < n - 4 * (i+1)) {
                System.out.println("NO");
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("YES");
        }

    }

    public static int linearSearch(Integer[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
