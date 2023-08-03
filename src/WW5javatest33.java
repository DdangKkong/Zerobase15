import java.util.*;

public class WW5javatest33 {
    public static void main(String[] args) {
//        solution(new int[]{1, 2, 3, 4});
    }

//    public int solution(int[] people, int limit) {
//        int answer = 0;
//        Deque<Integer> dq = new LinkedList<>();
//        Arrays.sort(people);
//        for (int i = 0; i < people.length; i++) {
//            dq.add(people[i]);
//        }
//        while (dq.size() > 1) {
//            if (dq.getFirst() + dq.getLast() > limit) {
//                dq.removeLast();
//                answer++;
//            } else {
//                dq.removeFirst();
//                dq.removeLast();
//                answer++;
//            }
//        }
//        if (dq.size() == 1) {
//            dq.removeFirst();
//            answer++;
//        }
//
//        return answer;
//    }

//    public static int solution(int[] A) {
//        int answer = 0;
//        Arrays.sort(A);
//        int[] a = new int[A.length];
//        int i = 1;
//        int j = 0;
//        int b = 0;
//        int c = 0;
//        if (A.length % 2 == 1) {
//            while (A.length >= 2*i - 1) {
//                b = A.length - i;
//                c = A.length - (2*i - 1);
//                a[c] = A[b];
//                i++;
//            }
//            while (A.length >= i + j) {
//                b = A.length - i - j;
//                c = 2*j + 1;
//                a[c] = A[b];
//                j++;
//            }
//        } else {
//            i = 0;
//            while (A.length >= 2*i + 1) {
//                b = i;
//                c = A.length - (2*i + 1);
//                a[c] = A[b];
//                i++;
//            }
//            while (A.length > i + j) {
//                b = i + j;
//                c = 2*j;
//                a[c] = A[b];
//                j++;
//            }
//        }
//        for (int k = 0; k < a.length; k++) {
//            if (k % 2 == 0) {
//                answer += a[k] * (k + 1);
//            } else {
//                answer -= a[k] * (k + 1);
//            }
//        }
//
//
//        return answer;
//    }

//    public int solution(int A) {
//        int answer = 0;
//        int[] a = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//        int b = 0;
//        while (A > 0) {
//            for (int i = 0; i < a.length; i++) {
//                if (A >= a[i] && b < a[i]) {
//                    b = a[i];
//                }
//            }
//            A -= b;
//            b = 0;
//            answer++;
//        }
//
//        return answer;
//    }

//    public int solution(int[] arr, int n) {
//        int answer = 100001;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= n && answer > arr[i]) {
//                answer = arr[i];
//            }
//        }
//        if (answer == 100001) {
//            answer = -1;
//        }
//
//        return answer;
//    }

//    public int solution(int[] fruits) {
//        int answer = -10001;
//        int a = 0;
//        for (int i = 0; i < fruits.length; i++) {
//                for (int j = 0; i + j < fruits.length; j++) {
//                    a += fruits[i + j];
//                    if (answer <= a) {
//                        answer = a;
//                    }
//                }
//            a = 0;
//        }
//
//        return answer;
//    }

}
