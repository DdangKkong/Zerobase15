import java.util.ArrayList;
import java.util.Arrays;

public class WW8thurtest3 {
    public static void main(String[] args) {
//        solution(3, new int[][]{{1, 3}, {2, 3}});
//        solution(new int[]{1,4,2}, 12);
        solution(2, 4,5,-3);
    }

    public static int solution(int x1, int y1, int x2, int y2) {
        int answer = 0;
        int X = Math.abs(x1 - x2);
        int Y = Math.abs(y1 - y2);
        boolean a = true;
        while (a) {
            X--;
            Y--;
            if (Y < 0) {
                Y++;
            } else if (X < 0) {
                X++;
            } else if (X > Y) {
                X--;
            } else {
                Y--;
            }
            answer++;
            if (X == 0 && Y == 0) {
                a = false;
            }
        }

        return answer;
    }


//    public static int solution(int[] numbers, int target) {
//        int answer = 0;
//        Arrays.sort(numbers);
//        int i = numbers.length-1;
//        while (target != 0) {
//            if (i < 0) {
//                return -1;
//            }
//            if (numbers[i] != 0) {
//                int div = target / numbers[i];
//                answer += div;
//                target = target % numbers[i];
//            }
//            i--;
//        }
//
//        return answer;
//    }

//    public static int solution(int N, int[][] trust) {
//        int answer = 0;
//        int[] num = new int[N+1];
//        num[0] = 1;
//        int cnt = 0;
//        for (int i = 0; i < trust.length; i++) {
//            num[trust[i][0]] = 1;
//        }
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] == 0) {
//                answer = i;
//                cnt++;
//            }
//        }
//        if (cnt != 1) {
//            return -1;
//        }
//
//        ArrayList<Integer> people = new ArrayList<>();
//        for (int i = 0; i < trust.length; i++) {
//            if (trust[i][1] == answer) {
//                people.add(trust[i][0]);
//            }
//        }
//        for (int i = 0; i < people.size(); i++) {
//            num[people.get(i)] = 0;
//        }
//        num[0] = 0;
//        for (int i : num) {
//            if (i == 1) {
//                return -1;
//            }
//        }
//
//        return answer;
//    }

}
