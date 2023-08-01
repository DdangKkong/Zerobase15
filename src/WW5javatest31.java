import java.util.Arrays;

public class WW5javatest31 {
    public static void main(String[] args) {
        solution("001001000100");
    }

    public static String solution(String s) {
        String answer = "YES";
        String[] e = s.split("");
        int a = 5;
        int b = 5;
        int c = 6;
        int d = 6;
        for (int i = 0; i <= 5; i++) {
            if (e[i].equals("1")) {
                a = i;
                break;
            }
        }
        for (int i = 5; i >= 0; i--) {
            if (e[i].equals("1")) {
                b = i;
                break;
            }
        }
        for (int i = 6; i <= 11; i++) {
            if (e[i].equals("1")) {
                c = i;
                break;
            }
        }
        for (int i = 11; i >= 6; i--) {
            if (e[i].equals("1")) {
                d = i;
                break;
            }
        }
        if (b-a >= 3) {
            if (d-b >= 3) {
                answer = "NO";
            }
        }
        if (d-c >= 3) {
            if (c-a >= 3) {
                answer = "NO";
            }
        }

        return answer;
    }

//    public int solution(int n, int price) {
//        int answer = 0;
//        int b = n % 10;
//        int a = n / 10;
//        answer = n - a;
//        if (b < a) {
//            answer = n - a + 1;
//        }
//
//        answer *= price;
//
//        return answer;
//    }

//    public int solution(int n) {
//        int answer = 0;
//        if (n % 2 == 0) {
//            n = n/2 -1;
//        } else {
//            n = n/2;
//        }
//
//        answer = (int) Math.pow(10,n) * 9 % 1000000007;
//
//        return answer;
//    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        Arrays.sort(arr);
//        int a = -1;
//        if (arr.length % 2 == 0) {
//            a = arr.length/2;
//        } else {
//            a = arr.length/2 + 1;
//        }
//        int cnt = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == arr[a]) {
//                cnt = i;
//                break;
//            }
//        }
//        answer = arr.length/2 + (a - cnt);
//
//        return answer;
//    }

//    public boolean solution(int[] arr) {
//        boolean answer = true;
//        int[] a = new int[21];
//        for (int i = 0; i < arr.length; i++) {
//            a[arr[i]]++;
//        }
//        Arrays.sort(a);
//        for (int i = 1; i < a.length-1; i++) {
//            if (a[i] == 0) {
//            } else if ((a[i+1] - a[i]) == 0) {
//                answer = false;
//                break;
//            }
//        }
//
//        return answer;
//    }

}
