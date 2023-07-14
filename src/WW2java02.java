//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class WW2java02 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] NM = input.split(" ");
//        String input2 = sc.nextLine();
//        String[] Pick = input2.split(" ");
//        sc.close();
//        int count = 0;
//
//        Integer[] nm = new Integer[NM.length];
//        for (int i = 0; i < NM.length; i++) {
//            nm[i] = Integer.parseInt(NM[i]);
//        }
//        int N = nm[0];
//        int M = nm[1];
//
//        Integer[] pick = new Integer[M];
//        for (int i = 0; i < Pick.length; i++) {
//            pick[i] = Integer.parseInt(Pick[i]);
//        }
//
//        Queue<Integer> que = new LinkedList<>();
//        for (int i = 1; i <= N; i++) {
//            que.add(i);
//        }
//
//        for (int i = 0; i < M; i++) {
//            int index = ((LinkedList<Integer>) que).indexOf(pick[i]);
//            int half = que.size() / 2 + 1;
//            if (que.size() % 2 == 0) {
//                half = que.size() / 2;
//            }
//
//            if (index < half ) {
//                for (int j = 1; j <= index; j++) {
//                    que.add(que.poll());
//                    count++;
//                }
//                que.remove();
//            } else {
//                for (int j = 1; j <= que.size() - index; j++) {
//                    for (int k = 1; k <= que.size() - 1; k++) {
//                        que.add(que.poll());
//                    }
//                    count++;
//                }
//                que.remove();
//            }
//        }
//        System.out.println(count);
//
//    }
//}
