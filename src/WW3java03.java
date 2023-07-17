import java.util.ArrayList;
import java.util.Scanner;

public class WW3java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            ar.add(a);
        }

        for (int j=0; j<n; j++){
            String VPS = ar.get(j);
            char[] vps = new char[VPS.length()];
            for (int i = 0; i < VPS.length(); i++) {
                vps[i] = VPS.charAt(i);
            }

            int cnt = 0;
            for (int i = 0; i < vps.length; i++) {
                if (String.valueOf(vps[i]).equals("(")) {
                    cnt++;
                } else {
                    cnt--;
                }
                if (cnt < 0) {
                    cnt = 50;
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }
}
