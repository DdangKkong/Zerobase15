import java.util.Arrays;

public class WW4javatest24 {
    public static void main(String[] args) {
//        solution(new String[]{"n", "nav", "nev"},"naver");
//        solution("StringInt", "IntString");
        solution(new int[]{5, 2, 3, 4, 1}, 7);
//        solution(new int[]{2, 5, 6, 4, 2, 6, 6});
    }

//    public static int solution(int[] nums) {
//        int answer = 0;
//        int[] a = new int[101];
//        for (int i = 0; i < nums.length; i++) {
//            a[nums[i]]++;
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 1 || a[i] == 0) {
//                a[i] = 0;
//            } else {
//                a[i] = pak(a[i]) / (pak(a[i]-2) * 2);
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            answer += a[i];
//        }
//
//        return answer;
//    }
//    public static int pak (int num) {
//        int answer = 1;
//        if (num != 0) {
//            for (int i = 1; i <= num; i++) {
//                answer *= i;
//            }
//        }
//        return answer;
//    }

    public static int solution(int[] A, int K) {
        int answer = 0;
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            if (K >= A.length) {
                K = K-(A.length-1);
                cnt++;
            }
            if (K < A.length) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A[A.length-1-cnt]);
        sb.append(A[A.length-1-cnt-(K-cnt)]);
        answer = Integer.parseInt(sb.toString());
        if (K <= cnt) {
            StringBuilder a = new StringBuilder();
            a.append(A[A.length-1-cnt]);
            a.append(A[A.length-1-cnt+K]);
            answer = Integer.parseInt(a.toString());
        }

        return answer;
    }

//    public static int solution(String S1, String S2) {
//        int answer = 0;
//        char[] s1 = S1.toCharArray();
//        int cnt = 0;
//        for (int i = 0; i < s1.length; i++) {
//            if ((int) s1[i] < 'a') {
//                cnt = i;
//            }
//        }
//        StringBuilder s = new StringBuilder();
//        StringBuilder b = new StringBuilder();
//        for (int i = 0; i < cnt; i++) {
//            s.append(s1[i]);
//        }
//        for (int i = cnt; i < s1.length; i++) {
//            b.append(s1[i]);
//        }
//        b.append(s);
//        String c = b.toString();
//        if (S2.equals(c)) {
//            answer = 1;
//        }
//
//        return answer;
//    }

//    public int solution(int N, int K) {
//        int answer = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <= N; i++) {
//            sb.append(i);
//        }
//        String a = sb.toString();
//        char[] b = a.toCharArray();
//        String k = String.valueOf(K);
//        char[] c = k.toCharArray();
//        for (int i = 0; i < b.length; i++) {
//            if (c[0] == b[i]) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }

//    public static int solution(String[] array, String s) {
//        int answer = 0;
//        char[] b = s.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            char[] a = array[i].toCharArray();
//            int j = 0;
//            boolean cnt = true;
//            while (j < a.length && cnt && b.length >= a.length) {
//                if (b[j] != a[j]) {
//                    cnt = false;
//                }
//                if (b[j] == a[j]) {
//                    j++;
//                }
//            }
//            if (j == a.length) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }

}
