import java.util.*;

public class WW5javatest35 {
    public static void main(String[] args) {
//        solution(new int[]{5000, 10000, 1000, 1000, 500, 100, 50, 10});
//        solution(-278, 3);
    }

//    public static int solution(int N, int K) {
//        int answer = 0;
//        int c = 0;
//        ArrayList<String> b = new ArrayList<>();
//        if (N < 0) {
//            N *= -1;
//            String[] a = Integer.toString(N).split("");
//            for (int i = 0; i < a.length; i++) {
//                if (Integer.parseInt(a[i]) > K) {
//                    c = i;
//                    break;
//                }
//                if (c == 0) {
//                    c = a.length-1;
//                }
//            }
//            b.addAll(Arrays.asList(a));
//            b.add(c, Integer.toString(K));
//            StringBuffer sb = new StringBuffer();
//            for (String s : b) {
//                sb.append(s);
//            }
//            answer = Integer.parseInt(sb.toString()) * -1;
//            N *= -1;
//        }
//        if (N > 0) {
//            String[] a = Integer.toString(N).split("");
//            for (int i = 0; i < a.length; i++) {
//                if (Integer.parseInt(a[i]) < K) {
//                    c = i;
//                    break;
//                }
//                if (c == 0) {
//                    c = a.length-1;
//                }
//            }
//            b.addAll(Arrays.asList(a));
//            b.add(c, Integer.toString(K));
//            StringBuffer sb = new StringBuffer();
//            for (String s : b) {
//                sb.append(s);
//            }
//            answer = Integer.parseInt(sb.toString());
//        }
//        if (N == 0) {
//            StringBuffer sb = new StringBuffer();
//            sb.append(Integer.toString(K));
//            sb.append("0");
//
//            answer = Integer.parseInt(sb.toString());
//        }
//        return answer;
//    }

//    public int[] solution(int[] arr) {
//        int[] answer = {};
//        if (arr.length == 0) {
//            return arr;
//        }
//        Stack<Integer> a = new Stack<>();
//        ArrayList<Integer> b = new ArrayList<>();
//        ArrayList<Integer> c = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 1000) {
//                a.add(arr[i]);
//            }
//            if (arr[i] < 1000) {
//                c.add(arr[i]);
//            }
//        }
//        if (a.size() > 0) {
//            b.add(a.pop());
//            int d = 0;
//            while (a.size() > 0) {
//                d += a.pop();
//            }
//            for (int i = 0; i < d/500; i++) {
//                b.add(500);
//            }
//        }
//        if (c.size() > 0) {
//            int f = 0;
//            for (int i = 0; i < c.size(); i++) {
//                f += c.get(i);
//            }
//            for (int i = 0; i < f/500; i++) {
//                b.add(500);
//            }
//            f %= 500;
//            for (int i = 0; i < f/100; i++) {
//                b.add(100);
//            }
//            f %= 100;
//            for (int i = 0; i < f/50; i++) {
//                b.add(50);
//            }
//            f %= 50;
//            for (int i = 0; i < f/10; i++) {
//                b.add(10);
//            }
//        }
//        if (b.size() > 0) {
//            answer = new int[b.size()];
//            for (int i = 0; i < b.size(); i++) {
//                answer[i] = b.get(i);
//            }
//        }
//
//        return answer;
//    }

//    public int solution(int[] A, int K) {
//        int answer = 0;
//        Arrays.sort(A);
//        int a = 0;
//        for (int i = 0; i < A.length; i++) {
//            a += A[i];
//            if (a == K) {
//                answer = i + 1;
//                break;
//            } else if (a > K) {
//                answer = i;
//                break;
//            }
//        }
//
//        return answer;
//    }

//    public int solution(int n) {
//        int answer = 0;
//        ArrayList<Integer> a = new ArrayList<>();
//        for (int i = 1; i < n+1; i++) {
//            a.add(i);
//        }
//        int b = 0;
//        for (int i = 0; i < a.size(); i++) {
//            for (int j = 0; i + j < a.size(); j++) {
//                b += a.get(i+j);
//                if (b == n) {
//                    answer++;
//                    b = 0;
//                    break;
//                } else if (b > n) {
//                    b = 0;
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }

}
