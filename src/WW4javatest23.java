import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class WW4javatest23 {
    public static void main(String[] args) {
//        solution(new int[]{1, 2, 3, 4, 6, 6, 6});
    }

//    public double solution(String S) {
//        double answer = 0;
//
//
//        return answer;
//    }

//    public int solution(int A, int B) {
//        int answer = 0;
//        int C = A ^ B;
//        String c = Integer.toBinaryString(C);
//        char[] d = c.toCharArray();
//        for (int i = 0; i < d.length; i++) {
//            if (d[i] == '1') {
//                answer++;
//            }
//        }
//
//        return answer;
//    }

//    public static int[] solution(int[] nums) {
//        HashMap<Integer,Integer> a = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            a.put(nums[i], 1);
//        }
//        Integer[] c = a.keySet().toArray(new Integer[0]);
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < c.length; i++) {
//            s.append(c[i]);
//        }
//        String d = s.toString();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= nums.length; i++) {
//            if (d.contains(String.valueOf(i))) {
//            } else {
//                sb.append(i);
//            }
//        }
//        String[] b = sb.toString().split("");
//        int[] answer = new int[b.length];
//        for (int i = 0; i < b.length; i++) {
//            answer[i] = Integer.parseInt(b[i]);
//        }
//
//        return answer;
//    } // 위에로 바꾼건데 런타임 에러에 실패도 하나 더 뜨네... 4점
//    public int[] solution(int[] nums) {
//        HashMap<Integer,Integer> a = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            a.put(nums[i], 1);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= nums.length; i++) {
//            if (a.containsKey(i)) {
//                continue;
//            } else {
//                sb.append(i);
//            }
//        }
//        String[] b = sb.toString().split("");
//        int[] answer = new int[b.length];
//        for (int i = 0; i < b.length; i++) {
//            answer[i] = Integer.parseInt(b[i]);
//        }
//
//        return answer;
//    } // 런타임 에러 1 .... 16점

//    public static String solution(String s) {
//        String answer = "";
//        char[] a = s.toCharArray();
//        int[] b = new int[a.length];
//        for (int i = 0; i < s.length(); i++) {
//            b[i] = Integer.parseInt(String.valueOf(a[i]));
//        }
//        int[] c = new int[10];
//        for (int i = 0; i < b.length; i++) {
//            c[b[i]]++;
//        }
//        int cnt = -1;
//        StringBuilder sb = new StringBuilder();
//        for (int j = 0; j < c.length; j++) {
//            for (int i = 0; i < c.length; i++) {
//                if (c[i] > cnt) {
//                    cnt = i;
//                }
//            }
//            sb.append(cnt);
//            if (j == c.length-1) {
//                break;
//            }
//            sb.append(" ");
//            c[cnt] = -1;
//            cnt = -1;
//        }
//        answer = sb.toString();
//
//        return answer;
//    } // 런타임 에러 2.... 12점

//    public int solution(int N, int K) {
//        int answer = 0;
//        Queue<Integer> a = new LinkedList<>();
//        for (int i = 0; i < N; i++) {
//            a.add(i+1);
//        }
//        while (a.size() != 1) {
//            for (int i = 0; i < K - 1; i++) {
//                a.add(a.poll());
//            }
//            a.poll();
//        }
//        answer = a.poll();
//
//        return answer;
//    }

}
