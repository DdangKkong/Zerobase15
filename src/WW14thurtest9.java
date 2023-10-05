public class WW14thurtest9 {

    public static void main(String[] args) {
//        solution(4, new int[][] {{0, 2, 1}, {1, 3, 20}, {1, 0, 8}, {2, 3, 1}, {0, 3, 3}}, 1,3,2);
    }

//    public int solution(int N, int[][] graph, int[] infected) {
//        int answer = 0;
//        int[] pos = new int[infected.length];
//        for (int i = 0; i < infected.length; i++) {
//            int k = infected[i];
//            int sum = 0;
//            for (int j = 0; j < graph[0].length; j++) {
//                sum += graph[k][j];
//            }
//            pos[i] = sum;
//        }
//
//        int max = 0;
//        for (int i = 0; i < pos.length; i++) {
//            if (max < pos[i]) {
//                answer = i;
//                max = pos[i];
//            }
//        }
//
//        return infected[answer];
//    }

//    public static int solution(int N, int[][] flight, int a, int b, int k) {
//        int answer = fly(N, flight, a, b, k);
//
//        return answer;
//    }
//    public static int fly(int N, int[][] flight, int a, int b, int k) {
//        if (k == 0) {
//            return -1;
//        }
//        for (int i = 0; i < flight.length; i++) {
//            int cost = 0;
//            if (flight[i][0] == a) {
//                int a1 = flight[i][1];
//                cost += flight[i][2];
//                if (a1 == b) {
//                    return cost;
//                }
//                int num = fly(N, flight, a1, b, k-1);
//                if (num != -1) {
//                    cost += num;
//                }
//            }
//        }
//        return 0;
//    }

    public int solution(int N, int[][] friend, int[][] time) {
        int answer = 0;
        int[] fri = new int[N-1];
        int[] ti = new int[N-1];
        for (int i = 0; i < ti.length; i++) {
            ti[i] = 100;
        }

        for (int i = 0; i < friend.length; i++) {
            for (int j = 0; j < friend[0].length; j++) {
                int idx = friend[i][j];
                fri[idx] = 1;
                int data = time[i][j];
                if (ti[idx] > data) {
                    ti[idx] = data;
                }


            }
        }

        return answer;
    }

}
