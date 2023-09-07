import java.util.Arrays;

public class WW10thurtest5 {
    public static void main(String[] args) {
        solution(2, 20, new int[]{3,6},new int[]{2,1});
    }

    public static int solution(int N, int M, int[] fry, int[] clean) {
        int answer = 0;
        if (M < N) {
            Arrays.sort(fry);
            answer = fry[M-1];
            return answer;
        }
        for (int i = 0; i < clean.length; i++) {
            int j = fry[i] + clean[i];
            clean[i] = j;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < clean.length; i++) {
            if (max < clean[i]) {
                max = clean[i];
            }
            if (min > clean[i]) {
                min = clean[i];
            }
        }
        answer = (max + min) * (M - N) / (2 * 2);
        int comp = 0;
        while (true) {
            for (int i = 0; i < fry.length; i++) {
                comp += (answer - fry[i]) / clean[i];
            }
            if (comp == M-N) {
                break;
            }
            comp = 0;
            answer++;
        }

        return answer;
    }

//    public int solution(int N, int[] branches) {
//        int sum = 0;
//        for (int i :
//                branches) {
//            sum += i;
//        }
//        sum /= N;
//        if (sum == 0) {
//            return -1;
//        }
//        while (sum > 0) {
//            int sumc = 0;
//            for (int i = 0; i < branches.length; i++) {
//                sumc += branches[i] / sum;
//            }
//            if (sumc >= N) {
//                break;
//            }
//            sum--;
//        }
//        if (sum == 0) {
//            return -1;
//        }
//
//        return sum;
//    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        int comp = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            int j = arr[i];
//            if (comp < j) {
//                answer++;
//                break;
//            }
//        }
//        if (answer == 0) {
//            return -1;
//        }
//        for (int i = answer; i < arr.length; i++) {
//            comp = arr[answer-1];
//            int j = arr[i];
//            if (comp > j) {
//                answer--;
//                break;
//            }
//            answer++;
//        }
//        if (answer == arr.length) {
//            return -1;
//        }
//
//        return answer;
//    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        int[] copy = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            copy[i] = arr[i];
//        }
//        Arrays.sort(copy);
//        int peek = copy[copy.length-1];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == peek) {
//                answer = i;
//            }
//        }
//        if (answer == 0 || answer == arr.length-1) {
//            answer = -1;
//        }
//
//        return answer;
//    }

//    public boolean solution(String s, String t) {
//        boolean answer = true;
//        char[] S = s.toCharArray();
//        char[] T = t.toCharArray();
//        int sums = 0;
//        int sumt = 0;
//        if (s.length() != t.length()) {
//            return false;
//        }
//        for (int i = 0; i < S.length; i++) {
//            int j = (int) S[i];
//            sums += j;
//        }
//        for (int i = 0; i < T.length; i++) {
//            int j = (int) S[i];
//            sumt += j;
//        }
//        if (sums != sumt) {
//            answer = false;
//        }
//
//        return answer;
//    }

}
