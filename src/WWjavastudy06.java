/*
        이원우
*/

import java.util.Random;
import java.util.Scanner;

public class WWjavastudy06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int a1 = 0; int a2 = 0; int a3 = 0; int a4 = 0; int a5 = 0; int a6 = 0; int a7 = 0; int a8 = 0; int a9 = 0; int a10 = 0;
        int[] a = new int[10];
        String[] A = new String[10];
        int maxnum = 0;

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int vnum = sc.nextInt();
        sc.nextLine();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int cnum = sc.nextInt();
        sc.nextLine();

        String[] can = new String[10];
        for (int i = 1; i < cnum + 1; i++) {
            System.out.print(i + "번째 후보자이름을 입력해 주세요.");
            String cand = sc.nextLine();
            can[i - 1] = cand;
        }
        System.out.println();


        for (int i = 1; i <= vnum; i++) {
            double turnout = i * 10000 / vnum;
            String to = String.format("%.2f", turnout / 100);

            int rdnum = rd.nextInt(cnum);
            if (rdnum == 0) { a1++; } else if (rdnum == 1) { a2++; } else if (rdnum == 2) { a3++; } else if (rdnum == 3) { a4++; } else if (rdnum == 4) { a5++; } else if (rdnum == 5) { a6++; } else if (rdnum == 6) { a7++; } else if (rdnum == 7) { a8++; } else if (rdnum == 8) { a9++; } else if (rdnum == 9) { a10++; }

            double aa1 = a1 * 10000 / vnum;
            String A1 = String.format("%.2f", aa1 / 100);
            double aa2 = a2 * 10000 / vnum;
            String A2 = String.format("%.2f", aa2 / 100);
            double aa3 = a3 * 10000 / vnum;
            String A3 = String.format("%.2f", aa3 / 100);
            double aa4 = a4 * 10000 / vnum;
            String A4 = String.format("%.2f", aa4 / 100);
            double aa5 = a5 * 10000 / vnum;
            String A5 = String.format("%.2f", aa5 / 100);
            double aa6 = a6 * 10000 / vnum;
            String A6 = String.format("%.2f", aa6 / 100);
            double aa7 = a7 * 10000 / vnum;
            String A7 = String.format("%.2f", aa7 / 100);
            double aa8 = a8 * 10000 / vnum;
            String A8 = String.format("%.2f", aa8 / 100);
            double aa9 = a9 * 10000 / vnum;
            String A9 = String.format("%.2f", aa9 / 100);
            double aa10 = a10 * 10000 / vnum;
            String A10 = String.format("%.2f", aa10 / 100);

            A[0] = A1; A[1] = A2; A[2] = A3; A[3] = A4; A[4] = A5; A[5] = A6; A[6] = A7; A[7] = A8; A[8] = A9; A[9] = A10;
            a[0] = a1; a[1] = a2; a[2] = a3; a[3] = a4; a[4] = a5; a[5] = a6; a[6] = a7; a[7] = a8; a[8] = a9; a[9] = a10;

            int max = a[0];
            int maxi = 0;
            for (int j = 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                    maxi = j;
                }
            }
            maxnum = maxi;

            System.out.println("[투표진행률]:\t" + to + "%, " + i + "명 투표 => " + can[rdnum]);

            for (int j = 1; j <= cnum; j++) {
                System.out.println("[기호:" + j + "]\t" + can[j - 1] + ":\t" + A[j - 1] + "%\t(투표수: " + a[j - 1] + ")");
            }
            System.out.println();

        }

            System.out.println("[투표결과] 당선인 : " + can[maxnum]);
    }
}
