import java.util.*;

public class WW5javatest32 {
    public static void main(String[] args) {
    }

//    public int solution(int[] arr, int n) {
//        int answer = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= n && arr[i] > answer) {
//                answer = arr[i];
//            }
//        }
//
//        return answer;
//    }

//    public boolean solution(boolean[][] matrix, boolean b) {
//        boolean answer = true;
//        for (int i = 0; i < matrix.length; i++) {
//            for ( int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] != b) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }

//    public String solution(int[] arr, String prefix, String separator, String postfix) {
//        String answer = "";
//        StringBuffer sb = new StringBuffer();
//        sb.append(prefix);
//        for (int i = 0; i < arr.length-1; i++) {
//            sb.append(Integer.toString(arr[i]));
//            sb.append(separator);
//        }
//        sb.append(Integer.toString(arr[arr.length-1]));
//        sb.append(postfix);
//
//        answer = sb.toString();
//
//        return answer;
//    }

//    public int[] solution(int[] arr1, int[] arr2) {
//        LinkedList<Integer> a = new LinkedList<>();
//        for(int i = 0; i < arr1.length; i++) {
//            a.add(arr1[i]);
//        }
//        LinkedList<Integer> b = new LinkedList<>();
//        for(int i = 0; i < arr2.length; i++) {
//            if (a.contains(arr2[i])){
//                b.add(arr2[i]);
//            }
//        }
//        int[] answer = new int[b.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = b.get(i);
//        }
//        Arrays.sort(answer);
//
//        return answer;
//    }

//    public int solution(String s, int n) {
//        int answer = 0;
//        String[] a = s.split("");
//        for(int i = 0; i < a.length; i++){
//            if (Integer.parseInt(a[i]) == n) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }

}
