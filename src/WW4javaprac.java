import java.util.*;
import java.util.stream.Collectors;

public class WW4javaprac {

    public static void main(String[] args) {
//        solution("AbcAbcA", "AAA");
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

//    public static int solution(String str1, String str2) {
//        int answer = 0;
//        String[] a = str1.split("");
//        String[] b = str2.split("");
//        int d = 0;
//        int i = 0;
//        for (int j = 0; j < a.length; j++) {
//            if (b[i].equals(a[j])) {
//                d = j;
//                if (j == a.length-1) {
//                    break;
//                }
//                while (b[i+1].equals(a[j+1])){
//                    i++;
//                    j++;
//                    if (i == b.length - 1) {
//                        answer = 1;
//                        break;
//                    }
//                }
//                i = 0;
//                j = d;
//            }
//        }
//        if (answer == 0) {
//            answer = 2;
//        }
//
//        return answer;
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = "a";
//        ArrayList<String> b = new ArrayList<>();
//        do {
//            a = sc.nextLine();
//            b.add(a);
//            if (a.equals("=")) {
//                break;
//            }
//        } while (true);
//
//        int[] c = new int[b.size() / 2];
//        String[] d = new String[b.size() / 2];
//        c[0] = Integer.parseInt(b.get(0));
//        d[0] = b.get(1);
//        for (int i = 1; i < b.size(); i++) {
//            if (i % 2 == 1) {
//                d[i/2] = b.get(i);
//            } else {
//                c[i/2] = Integer.parseInt(b.get(i));
//            }
//        }
//
//        int ans = c[0];
//        for (int i = 0; i < d.length - 1; i++) {
//            if (d[i].equals("+")) {
//                ans += c[i+1];
//            } else if (d[i].equals("-")) {
//                ans -= c[i+1];
//            } else if (d[i].equals("*")) {
//                ans *= c[i+1];
//            } else if (d[i].equals("/")) {
//                ans /= c[i+1];
//            }
//        }
//
//        System.out.println(ans);
//
//    }



//    public int[] solution(int[] numbers, String direction) {
//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//
//        if (direction.equals("right")) {
//            list.add(0, list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        } else {
//            list.add(list.size(), list.get(0));
//            list.remove(0);
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//    public int[] solution(int[] numbers, String direction) {
//        int[] answer = new int[numbers.length];
//        LinkedList<Integer> a = new LinkedList<>();
//        for (int b : numbers
//             ) {
//            a.add(b);
//        }
//        int d = 0;
//        if (direction.length() == 4) {
//            d = a.get(0);
//            a.remove(0);
//            a.addLast(d);
//        }
//        if (direction.length() == 5) {
//            d = a.getLast();
//            a.removeLast();
//            a.addFirst(d);
//        }
//        Integer[] c = a.toArray(new Integer[a.size()]);
//
//        for (int i = 0; i < a.size(); i++) {
//            answer[i] = c[i];
//        }
//
//        return answer;
//    }

//    public String solution(String s) {
//        String answer = "";
//        StringBuilder sb = new StringBuilder();
//        char[] a = s.toCharArray();
//        int cnt = 0;
//        for (int i = 'a'; i <= 'z'; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if ((int) a[j] == i) {
//                    cnt++;
//                }
//            }
//            if (cnt == 1) {
//                sb.append((char) i);
//            }
//            cnt = 0;
//        }
//        answer = sb.toString();
//
//        return answer;
//    }

}
