import java.util.*;

public class WW4javatest21 {
    public static void main(String[] args) {
//        solution("가나나가", "드래곤 바나나 바나나 드래곤");
    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        Arrays.sort(arr);
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int i = 0;
//        do {
//            if (i > arr.length - 3) {
//                answer = 0;
//                break;
//            }
//            a = arr[arr.length - 1-i];
//            b = arr[arr.length - 2-i];
//            c = arr[arr.length - 3-i];
//            answer = a + b + c;
//            i++;
//        } while (a >= b + c);
//
//        return answer;
//    }

    public boolean solution(String p, String s) {
        boolean answer = false;
        String[] a = p.split("");
        String[] b = s.split(" ");
        HashMap<String,String> c = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            c.put(a[i], b[i]);
        }
        int cnt = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(a[i]).equals(b[i])) {
                cnt++;
            }
        }
        if (cnt == c.size()) {
            cnt = 0;
            c.clear();
            for (int i = 0; i < p.length(); i++) {
                c.put(b[i], a[i]);
            }
            for (int i = 0; i < c.size(); i++) {
                if (c.get(b[i]).equals(a[i])) {
                    cnt++;
                }
            }
            if (cnt == c.size()) {
                answer = true;
            }
        }

        return answer;
    }

//    public int[] solution(int[] arr1, int[] arr2) {
//        ArrayList<Integer> a = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    a.add(arr1[i]);
//                }
//            }
//        }
//
//        int[] answer = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            answer[i] = a.get(i);
//        }
//        Arrays.sort(answer);
//
//        return answer;
//    }

//    public int solution(String s) {
//        int answer = 0;
//        String[] a = s.split(" ");
//        HashMap<String,String> b = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            b.put(a[i],"");
//        }
//        answer = b.size();
//
//        return answer;
//    }

//    public int solution(int[] arr) {
//        int answer = 0;
//        ArrayList<Integer> a = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            a.add(arr[i]);
//        }
//        int b = Collections.max(a);
//        int c = Collections.min(a);
//
//        for (int i = 0; i < a.size(); i++) {
//            answer += a.get(i);
//        }
//
//        answer = (answer - b - c) / (a.size() - 2);
//
//        return answer;
//    }

}
