import java.util.*;

public class WW5javatest34 {
    public static void main(String[] args) {
    }



//    public int[][] solution(int[][] city) {
//        ArrayList<Integer> x = new ArrayList<>();
//        ArrayList<Integer> y = new ArrayList<>();
//        int[][] a = new int[city.length][city[0].length];
//        for (int i = 0; i < city.length; i++) {
//            for (int j = 0; j < city[0].length; j++) {
//                a[i][j] = Integer.MAX_VALUE;
//            }
//        }
//        for (int i = 0; i < city.length; i++) {
//            for (int j = 0; j < city[0].length; j++) {
//                if (city[i][j] == 0) {
//                    x.add(i);
//                    y.add(j);
//                }
//            }
//        }
//        for (int k = 0; k < x.size(); k++) {
//            for (int i = 0; i < city.length; i++) {
//                for (int j = 0; j < city[0].length; j++) {
//                    city[i][j] = Math.abs(i-x.get(k)) + Math.abs(j-y.get(k));
//                }
//            }
//            for (int i = 0; i < city.length; i++) {
//                for (int j = 0; j < city[0].length; j++) {
//                    if (a[i][j] > city[i][j]) {
//                        a[i][j] = city[i][j];
//                    }
//                }
//            }
//        }
//
//        return a;
//    }

//    public boolean solution(int[] bridge, int jumpSize) {
//        boolean answer = true;
//        int a = 0;
//        int max = 0;
//        for (int i = 0; i < bridge.length; i++) {
//            if (bridge[i] == 0) {
//                a++;
//            }
//            if (max < a) {
//                max = a;
//            }
//            if (bridge[i] == 1) {
//                a = 0;
//            }
//        }
//        if (jumpSize < max) {
//            answer = false;
//        }
//
//        return answer;
//    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        int a = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                a++;
//            }
//            if (answer < a) {
//                answer = a;
//            }
//            if (arr[i] == 0) {
//                a = 0;
//            }
//        }
//
//        return answer;
//    }

//    public int solution(int[] A) {
//        int answer = 0;
//        int a = 0;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; i + j < A.length; j++) {
//                a += A[i + j];
//                if (answer <= a) {
//                    answer = a;
//                }
//            }
//            a = 0;
//        }
//
//        return answer;
//    }

}
