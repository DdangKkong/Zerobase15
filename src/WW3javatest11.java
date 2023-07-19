import java.util.Arrays;

public class WW3javatest11 {
    public static void main(String[] args) {


    }

//    public static int solution(String S) {
//        int answer = 0;
//        int s = Integer.parseInt(S);
//
//        do {
//            if (s % 10 == 1) {
//                s -= 1;
//                answer++;
//            } else if (s % 10 == 0) {
//                s /= 10;
//                answer++;
//            }
//        } while (s != 0);
//        return answer;
//    }


//    public  int solution(String s) {
//        int answer = 0;
//        char[] S = new char[s.length()];
//        int[] A = new int[s.length()];
//        int[] B = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            S[i] = s.charAt(i);
//        }
//        for (int i = 0; i < s.length(); i++) {
//            A[i] = S[i]-'0';
//        }
//
//        for (int i = 0; i < A.length; i++) {
//            B[A[i]]++;
//        }
//
//        int max = Arrays.stream(B).max().getAsInt();
//
//        for (int i = 0; i < B.length; i++) {
//            if (B[i] == max) {
//                answer = i;
//                break;
//            }
//        }
//
//        return answer;
//    }


//    public int solution(int[] A) {
//        int answer = 0;
//        int min = 1000000;
//        int max = 0;
//
//        for (int i = 0; i < A.length; i++) {
//            if (min > A[i]) {
//                min = A[i];
//                max = 0;
//            }
//            if (min < A[i]) {
//                max = A[i];
//            }
//            if (answer < max - min) {
//                answer = max - min;
//            }
//        }
//
//        return answer;
//    }




//    public int solution(int n) {
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++) {
//            answer += n;
//        }
//        return answer;
//    }





}
