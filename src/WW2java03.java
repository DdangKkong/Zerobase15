import java.util.Scanner;

public class WW2java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        String[] A = input.split(" ");

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(A[i]);
        }

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
