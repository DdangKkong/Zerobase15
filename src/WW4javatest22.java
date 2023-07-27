import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class WW4javatest22 {
    public static void main(String[] args) {
//        solution(new int[]{0, 2, 1, 4, 3, 0});
    }

//    public static int solution(int num) {
//        int answer = 1;
//        if (num < 0) {
//            answer = -1;
//            num *= -1;
//        }
//        String f = String.valueOf(num);
//        char[] a = f.toCharArray();
////        String[] a = String.valueOf(num).split("");
//        Stack<Character> b = new Stack<>();
//        for (int i = 0; i < a.length; i++) {
//            b.push(a[i]);
//        }
//        while (b.peek() == '0') {
//            b.pop();
//        }
//        char[] e = new char[b.size()];
////        String[] e = new String[b.size()];
//        for (int i = 0; i < e.length; i++) {
//            e[i] = b.pop();
//        }
//        String c = String.copyValueOf(e);
//        int d = Integer.parseInt(c);
//        answer *= d;
//
//        if (answer >= 100000 || answer <= -100000) {
//            answer = 0;
//        }
//
//        return answer;
//    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        if (arr.length % 2 == 1) {
//            int[] a = new int[100000];
//            for (int i = 0; i < arr.length; i++) {
//                a[arr[i]]++;
//            }
//            for (int i = 0; i < a.length; i++) {
//                if(a[i] == 1) {
//                    answer = i;
//                    break;
//                }
//            }
//
//        }
//
//        return answer;
//    }

//    public static int[] solution(int[] arr) {
//        ArrayList<Integer> a = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            a.add(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (a.get(i) % 2 == 1) {
//                a.add(i, a.get(i));
//                a.remove(a.size()-1);
//                i++;
//            }
//        }
//        int[] answer = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            answer[i] = a.get(i);
//        }
//
//        return answer;
//    }

//    public int solution(int n) {
//        int answer = (int) Math.cbrt(n);
//        answer = (int) Math.pow(answer, 3);
//
//        return answer;
//    }

//    public static int solution(int[] useageArr, int fee) {
//        int answer = 0;
//        answer = Arrays.stream(useageArr).sum() * fee;
//        return answer;
//    }

}
