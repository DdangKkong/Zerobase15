import java.util.Collections;
import java.util.PriorityQueue;

public class WW4javatest25 {
    public static void main(String[] args) {
        solution(1000000);
    }

//    public String solution(int[] arr) {
//        String answer = "YES";
//        if (arr[0] != 0) {
//            answer = "No";
//            return answer;
//        } else {
//            PriorityQueue<Integer> a = new PriorityQueue<>();
//            for (int i = 0; i < arr.length; i++) {
//                a.add(arr[i]);
//            }
//            Integer[] b = a.toArray(new Integer[0]);
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != b[i]) {
//                    answer = "NO";
//                }
//            }
//
//            return answer;
//        }
//    }

    public static int solution(int n) {
        int answer = ((int) (Math.pow(2, n) - 1)) % 1000000007;
        return answer;
    }

//    public static int solution(int n) {
//        int answer = 0;
//        for (int i = 0; i < n; i++) {
//            answer += Math.pow(2, i) % 1000000007;
//        }
//        answer %= 1000000007;
//
//        return answer;
//    }

//    public static int solution(int n) {
//        int answer = 0;
//        int[] a = new int[n];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = (int) Math.pow(2, i) % 1000000007;
//        }
//        for (int i = 0; i < a.length; i++) {
//            answer += a[i];
//        }
//
//        return answer % 1000000007;
//    }

//    public static int solution(int n) {
//        int answer = 0;
//        int a = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                a = (a * 2) % 1000000007;
//            }
//            answer += a;
//            a = 1;
//        }
//        answer %= 1000000007;
//
//        return answer;
//    }

//    public int solution(int[] cards) {
//        int answer = 0;
//        PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
//        for (int i = 0; i < cards.length; i++) {
//            a.add(cards[i]);
//        }
//        int b = 0;
//        int c = 0;
//        while (a.size() > 1) {
//            b = a.poll();
//            c = a.poll();
//            b -= c;
//            a.add(b);
//        }
//        answer = a.poll();
//
//        return answer;
//    }

//    public int solution(int[] nums, int n) {
//        int answer = -1;
//        for (int i = nums.length-1; i >= 0 ; i--) {
//            if (nums[i] == n) {
//                answer = i;
//            }
//        }
//
//        return answer;
//    }

//    public int solution(String sentence, String word) {
//        int answer = -1;
//        String[] a = sentence.split(" ");
//        for (int i = 0; i < a.length; i++) {
//            if (word.equals(a[i])) {
//                answer = i;
//                break;
//            }
//        }
//        if (sentence.length() > 1000) {
//            answer = -1;
//        }
//        if (word.length() > 1000) {
//            answer = -1;
//        }
//        char[] b = word.toCharArray();
//        for (int i = 0; i < b.length; i++) {
//            if ((int) b[i] < (int) 'A') {
//                answer = -1;
//            }
//        }
//
//        return answer;
//    }

}
