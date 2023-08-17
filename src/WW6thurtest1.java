import javax.management.Query;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WW6thurtest1 {
    public static void main(String[] args) {
//        solution(15);
        solution(10, 3, 4, new int[]{5, 3, 4});
    }

    public static long solution(int N, int M, int K, int[] capacity) {
        long answer = 1;
        int sum = 0;
        int b = 1;
        int c = N;
        int[] ca = new int[capacity.length];
        for (int i: capacity) {
            sum += i;
        }
        if (sum > N) {
            Queue<Integer> capa = new LinkedList<>();
            for (int i : capacity) {
                capa.add(i);
            }

            for (int k = 0; k < capacity.length; k++) {
                for (int j = 0; j < capacity.length; j++) {
                    ca[j] = capa.poll();
                }
                for (int i = 0; i < capacity.length; i++) {
                    int n = N - num(i - 1, ca);
                    int a = 1;
                    if (n >= 0 && n >= ca[i]) {
                        a = com(n, ca[i]);
                    }
                    b *= a;
                    N = n;
                }
                b *= per(K, M);

                for (int i : ca) {
                    capa.add(i);
                }
                capa.add(capa.poll());
                answer += b;
                b = 1;
                N = c;

            }
            answer -= 1;
        } else {
            for (int i = 0; i < capacity.length; i++) {
                int n = N - num(i - 1, capacity);
                int a = 1;
                if (n >= 0 && n >= capacity[i]) {
                    a = com(n, capacity[i]);
                }
                answer *= a;
                N = n;
            }
            answer *= per(K, M);
        }
        return answer;
    }

    public static int num(int i, int[] capa) {
        int ans = 0;
        if (i == -1) {
            return 0;
        } else {
            ans = capa[i] + num(i-1, capa);
        }
        return ans;
    }

    public static int fac(int n) {
        int answer = 0;
        if (n == 1 || n == 0) {
            return 1;
        } else {
            answer = n * fac(n - 1);
        }
        return answer;
    }

    public static int com(int n, int m) {
        int answer = fac(n) / (fac(m) * fac(n-m));
        return answer;
    }

    public static int per(int n, int m) {
        int answer = 1;
        for (int i = 0; i < m; i++) {
            answer *= n-i;
        }
        return answer;
    }

//    public int solution(String[] names) {
//        int answer = 0;
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (int i = 0; i < names.length; i++) {
//            hm.put(names[i],0);
//        }
//        answer = com(hm.size(), 4);
//
//        return answer;
//    }
//
//    public int fac(int n) {
//        int answer = 0;
//        if (n == 1 || n == 0) {
//            return 1;
//        } else {
//            answer = n * fac(n - 1);
//        }
//        return answer;
//    }
//
//    public int com(int n, int m) {
//        int answer = fac(n) / (fac(m) * fac(n-m));
//        return answer;
//    }
//
//    public int per(double n, double m) {
//        int answer = (int) Math.pow(n, m);
//        return answer;
//    }

//    public static int solution(int n) {
//        int answer = 0;
//        for (double i = 2; i < n; i++) {
//            if (num(i)) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//    public static boolean num(double n) {
//        if (n == 2) {
//            return true;
//        }
//        for (int i = 2; i < n; i++) {
//            double a = 0;
//            double b = 0;
//            a = n / i;
//            b = n / i;
//            if ((int) a == b) {
//                return false;
//            }
//        }
//        return true;
//    }

}
