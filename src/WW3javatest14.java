//public class WW3javatest14 {
//    public static void main(String[] args) {
//        solution(new String[]{"Wow", "Happy", "Gift", "joy", "Perfect"});
//
//    }
//
////    public static String solution(int[] arr) {
////        String answer = "";
////        char[] a = new char[arr.length];
////        for (int i = 0; i < arr.length; i++) {
////            a[i] = (char) arr[i];
////        }
////
////        answer = String.copyValueOf(a);
////
////        return answer;
////    }
//
////    public int solution(int n) {
////        int answer = 0;
////        for (int i = 1; i <= n; i++) {
////            if (n % i == 0) {
////                answer++;
////            }
////        }
////        return answer;
////    }
//
//    public static int solution(String[] arr) {
//        int answer = 0;
//        int[] a = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            a[i] = Integer.parseInt(arr[i], 2);
//        }
//
//        answer = a[0];
//        for (int i = 1; i < a.length; i++) {
//            answer ^= a[i];
//        }
//
//        return answer;
//    }
//
//    public static String solution(String s) {
//        String answer = "";
//
//        char[] a = s.toCharArray();
//        int[] b = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            b[i] = (int) a[i] - 48;
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            if (b[i] > 9) {
//                b[i] = b[i] - 'a' + 58;
//            }
//            b[i] = b[i] * (int) Math.pow(16, b.length-1-i);
//        }
//
//        int c = 0;
//        for (int i = 0; i < b.length; i++) {
//            c += b[i];
//        }
//
//        answer = Integer.toBinaryString(c);
//
//        return answer;
//    }
//
//    public static String solution(String[] arr) {
//        String answer = "";
//        for (int i = 0; i < arr.length-1; i++) {
//            answer += arr[i] + ",";
//        }
//        answer += arr[arr.length-1];
//        return answer;
//    }
//
//
//}
