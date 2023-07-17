public class WW3java01 {
    public static int[] solution(int n) {
        if (n % 2 == 1){
            n++;
        }
        int[] answer = new int[n/2];
        for (int i=0; i<n/2; i++) {
            answer[i] = 2 * i + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(10);
    }


}
