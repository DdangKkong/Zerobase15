import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class WW3javatest12 {

    public static void main(String[] args) {
        solution("Hello, 37, .World!?");

    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        answer = Arrays.stream(arr).min().getAsInt();
//        return answer;
//    }

//    public int solution(int[] orders, int n) {
//        int answer = 0;
//        int[] a = new int[1000];
//        for (int i = 1; i <= 1000; i++) {
//            a[i-1] = i;
//        }
//        for (int i = 0; i < orders.length; i++) {
//            a[orders[i]-1] = 0;
//        }
//        int cnt = 0;
//        for (int i = 0; i < 1000; i++) {
//            if (a[i] != 0) {
//                cnt++;
//                if (cnt == n) {
//                    answer = a[i];
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

//    public int solution(int[] A) {
//        int answer = 0;
//
//        answer = A[0];
//        for (int i = 1 ; i < A.length; i++) {
//            answer = gcd(answer, A[i]);
//        }
//
//        return answer;
//    }
//    // 최대공약수를 구하는 유클리드 호제법
//    public int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }


    public static String[] solution(String s) {
        String[] answer = {};
        Stack<Character> Ans = new Stack<>();

        answer = s.split("[\\s.,?!]+");

        for (int i = 0; i < answer.length; i++) {
            char[] A = answer[i].toCharArray();
            for (int j = 0; j < A.length; j++) {
                Ans.push(A[j]);
            }
            for (int j = 0; j < A.length; j++) {
                A[j] = Ans.pop();
            }
            answer[i] = String.copyValueOf(A);
        }

        return answer;
    }


//    public  String solution(int n, String s, int t) {
//        String answer = "";
//        Queue<String> qu = new LinkedList<>();
//        String[] Answer = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            qu.add(".");
//        }
//        char[] S = s.toCharArray();
//        for (int i = 0; i < S.length; i++) {
//            qu.add(String.valueOf(S[i]));
//        }
//        for (int i = 0; i < t; i++) {
//            qu.add(qu.poll());
//        }
//        for (int i = 0; i < n; i++) {
//            Answer[i] = qu.poll();
//        }
//        answer = String.join("",Answer);
//
//        return answer;
//    }






}
