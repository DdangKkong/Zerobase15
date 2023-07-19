import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

public class WW3javatest13 {
    public static void main(String[] args) {
        solution("-3+26-7+28");
    }

//    public int solution(String S) {
//        int answer = 0;
//        char[] a = S.toCharArray();
//        Queue<Character> b = new LinkedList<>();
//
//        do {
//            for (int i = 1; i < a.length; i++) {
//                if (a[i - 1] == a[i]) {
//                    a[i - 1] = 'A';
//                    a[i] = 'A';
//                }
//            }
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] == 'A') {
//                    continue;
//                }
//                b.add(a[i]);
//            }
//            if (b.size() == 0) {
//                answer = 1;
//                break;
//            }
//            if (a.length == b.size()) {
//                answer = 0;
//                break;
//            }
//            char[] c = new char[b.size()];
//            for (int i = 0; i < c.length; i++) {
//                c[i] = b.poll();
//            }
//            S = String.copyValueOf(c);
//            a = S.toCharArray();
//        } while (true);
//
//        return answer;
//    }


//    public static int solution(String s) {
//        int answer = 0;
//        int c = 0;
//        int d = 0;
//        String[] S = s.split("[+]");
//
//        if (Integer.parseInt(S[0]) < 0) {
//            d = Integer.parseInt(S[0]);
//            S[0] = "0";
//        }
//
//        for (int i = 0; i < S.length; i++) {
//            if (S[i].toCharArray().length >= 2) {
//                String[] A = S[i].split("[-]");
//                int[] b = new int[A.length];
//                for (int j = 0; j < A.length; j++) {
//                    b[j] = Integer.parseInt(A[j]);
//                }
//                c = b[0];
//                for (int j = 1; j < b.length; j++) {
//                    c -= b[j];
//                }
//                S[i] = Integer.toString(c);
//                c = 0;
//            }
//        }
//
//        int[] a = new int[S.length];
//        for (int i = 1; i < S.length; i++) {
//            a[i] = Integer.parseInt(S[i]);
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            answer += a[i];
//        }
//        answer += d;
//        return answer;
//    }

//    public String solution(String[] bj, String[] one, String[] two) {
//        String answer = "";
//        int a = 0;
//        String b = "";
//        for (int i = 0; i < bj.length; i++) {
//            for (int j = 0; j < one.length; j++) {
//                if (bj[i].equals(one[j])) {
//                    bj[i] = "null";
//                }
//            }
//            for (int j = 0; j < two.length; j++) {
//                if (bj[i].equals(two[j])) {
//                    bj[i] = "null";
//                }
//            }
//            if (bj[i] != "null") {
//                b = bj[i];
//            }
//        }
//
//        a = (3 + one.length + (2 * two.length)) * 150;
//
//        answer = Integer.toString(a) + "만원(" + b + ")";
//
//        return answer;
//    }

//    public static int solution(String S) {
//        int answer = 5;
//        char[] A = S.toCharArray();
//        Stack<String> qu = new Stack<>();
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == '(') {
//                qu.push("a");
//            } else if (A[i] == ')') {
//                String a = qu.pop();
//                if (a != "a") {
//                    answer = 0;
//                    break;
//                }
//            } else if (A[i] == '{') {
//                qu.push("b");
//            } else if (A[i] == '}') {
//                String a = qu.pop();
//                if (a != "b") {
//                    answer = 0;
//                    break;
//                }
//            } else if (A[i] == '[') {
//                qu.push("c");
//            } else if (A[i] == ']') {
//                String a = qu.pop();
//                if (a != "c") {
//                    answer = 0;
//                    break;
//                }
//            } else if (A[i] == '<') {
//                qu.push("d");
//            } else if (A[i] == '>') {
//                String a = qu.pop();
//                if (a != "d") {
//                    answer = 0;
//                    break;
//                }
//            }
//
//        }
//        if (answer == 5) {
//            answer = 1;
//        }
//        return answer;
//    }

//    public static String solution(String s) {
//        String answer = "";
//        char[] a = s.toCharArray();
//        Queue<Character> b = new LinkedList<>();
//
//        do {
//            for (int i = 1; i < a.length; i++) {
//                if (a[i - 1] == a[i]) {
//                    a[i - 1] = 'A';
//                    a[i] = 'A';
//                }
//            }
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] == 'A') {
//                    continue;
//                }
//                b.add(a[i]);
//            }
//            if (a.length == b.size()) {
//                break;
//            }
//            char[] c = new char[b.size()];
//            for (int i = 0; i < c.length; i++) {
//                c[i] = b.poll();
//            }
//            s = String.copyValueOf(c);
//            a = s.toCharArray();
//        } while (true);
//        answer = s;
//
//        return answer;
//    }

}
