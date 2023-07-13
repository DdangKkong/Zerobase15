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

        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        boolean result = true;

        for (int i = 0; i < n; i++) {
            if (s1 < A[i]) {
                s1 = A[i];
            } else if (s2 < A[i]) {
                s2 = A[i];
            } else if (s3 < A[i]) {
                s3 = A[i];
            } else if (s4 < A[i]) {
                s4 = A[i];
            } else {
                result = false;
                System.out.println("NO");
                break;
            }
        }
        if (result) {
            System.out.println("YES");
        }

    }
}

