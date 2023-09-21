import java.util.Arrays;

public class WW12thurtest7 {

    public static void main(String[] args) {
    }

    public int solution(int[] votes) {
        Arrays.sort(votes);
        return votes[votes.length / 2];
    }

}
