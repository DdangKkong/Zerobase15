import java.math.BigInteger;
import java.util.*;

public class WW7thurtest2 {
    public static void main(String[] args) {
//        solution(new int[]{9,9,9,9,9,9,9,9,9,9,9}, new int[]{1});
//        solution("de2{afew}w3{rq5{f}}");
        solution(new int[][]{{4,5,2,6,7},{5,4,2,4,6},{6,8,4,8,7},{7,3,6,6,4},{4,5,0,4,1,5}}, 3);
    }

    public static int[][] solution(int[][] image, int K) {
        int[][] answer = new int[image.length][image[0].length];
        int sum = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                for (int k = -K/2; k <= K/2; k++) {
                    for (int l = -K/2; l <= K/2; l++) {
                        if (i+k >= 0 && j+l >= 0 && i+k < 5 && j+l < 5) {
                            sum += image[i+k][j+l];
                        }
                    }
                }
                answer[i][j] = sum / (K*K);
                sum = 0;
            }
        }

        return answer;
    }

//    public static String solution(String code) {
//        String answer = "";
//        int a = 0;
//        int cnt = 0;
//        String[] b = code.split("");
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < b.length; i++) {
//            if (b[i].equals("{")) {
//                cnt++;
//            }
//        }
//        while (cnt > 0) {
//            int c = cnt;
//            int d = -1;
//            for (int i = 0; i < b.length; i++) {
//                if (b[i].equals("{")) {
//                    c--;
//                    if (c == 0) {
//                        d = i;
//                        break;
//                    }
//                }
//            }
//            a = Integer.parseInt(b[d-1]);
//            b[d-1] = "0";
//            for (int i = d+1; i < b.length; i++) {
//                if (b[i].equals("}")) {
//                    b[i] = "0";
//                    break;
//                }
//                sb.append(b[i]);
//                b[i] = "0";
//            }
//            String e = sb.toString();
//            sb.delete(0, sb.length());
//            String f = trans(a, e);
//
//            b[d] = f;
//            cnt--;
//        }
//        StringBuffer SB = new StringBuffer();
//        for (int i = 0; i < b.length; i++) {
//            if (!b[i].equals("0")) {
//                SB.append(b[i]);
//            }
//        }
//        answer = SB.toString();
//
//        return answer;
//    }
//    public static String trans(int num, String str){
//        StringBuffer SB = new StringBuffer();
//        char[] carr = str.toCharArray();
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < carr.length; j++) {
//                if (carr[j] != '0') {
//                    SB.append(carr[j]);
//                }
//            }
//        }
//        String result = SB.toString();
//        return result;
//    }

//    public static int[] solution(int[] a, int[] b) {
//        int[] answer = {};
//        StringBuffer sb1 = new StringBuffer();
//        StringBuffer sb2 = new StringBuffer();
//        if (a.length == 0) {
//            sb1.append(0);
//        }
//        if (b.length == 0) {
//            sb2.append(0);
//        }
//        if (a.length != 0 && b.length != 0) {
//            for (int i = 0; i < a.length; i++) {
//                sb1.append(a[i]);
//            }
//            for (int i = 0; i < b.length; i++) {
//                sb2.append(b[i]);
//            }
//        }
//
//        BigInteger c = new BigInteger(sb1.toString());
//        BigInteger e = new BigInteger(sb2.toString());
//        BigInteger f = c.add(e);
//        char[] d = String.valueOf(f).toCharArray();
//        answer = new int[d.length];
//        for (int i = 0; i < d.length; i++) {
//            answer[i] = Integer.parseInt(String.valueOf(d[i]));
//        }
//
//        return answer;
//    }

//    public int solution(int[] numbers) {
//        Arrays.sort(numbers);
//        int answer = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (answer != numbers[i]) {
//                break;
//            }
//            answer++;
//        }
//
//        return answer;
//    }

}
