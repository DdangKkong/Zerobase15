import java.util.Stack;

public class WW3javatest15 {
    public static void main(String[] args) {
        solution("Naver");

    }

    public static String solution(String s) {
        String answer = "";
        char[] a = s.toCharArray();
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (int) a[i];
        }
        for (int i = 0; i < b.length; i++) {
            if (65 <= b[i] && b[i] < 97) {
                b[i] += 32;
            } else if (b[i] >= 97) {
                b[i] -= 32;
            }
        }
        for (int i = 0; i < b.length; i++) {
            a[i] = (char) b[i];
        }
        answer = String.copyValueOf(a);

        return answer;
    }

//    public static String solution(String s) {
//        String answer = "";
//        char[] a = s.toCharArray();
//        int[] b = new int[a.length];
//        int[] c = new int[26];
//        for (int i = 0; i < a.length; i++) {
//            b[i] = ((int) a[i]) - 'a';
//        }
//        for (int i = 0; i < b.length; i++) {
//            c[b[i]]++;
//        }
//        int d = 0;
//        int f = 0;
//        for (int i = 0; i < c.length; i++) {
//            if (d < c[i]) {
//                d = c[i];
//                f = i;
//            }
//        }
//        char e = (char) (f + 'a');
//        answer = String.valueOf(e);
//
//        return answer;
//    }

//    public boolean solution(int n) {
//        boolean answer = true;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                if (i != n && i != 1) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

//    public static String solution(String s) {
//        String answer = "";
//        Stack<Character> a = new Stack<>();
//        char[] b = s.toCharArray();
//        for (int i = 0; i < b.length; i++) {
//            a.add(b[i]);
//        }
//        for (int i = 0; i < b.length; i++) {
//            b[i] = a.pop();
//        }
//        answer = String.copyValueOf(b);
//
//        return answer;
//    }

//    public int solution(int n) {
//        int answer = 0;
//        double a = 0;
//        a = Math.sqrt(n);
//        if (a == (int) a) {
//            answer = (int) a;
//        }
//        return answer;
//    }

}
