/*
        이원우
*/

import java.util.Random;
import java.util.Scanner;

public class WWjavastudy07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] lottonum = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] NUM = new String[60];
        String[] A = new String[6];
        int a = 0;
        String[] B = new String[6];
        int b = 0;
        String[] C = new String[6];
        int c = 0;
        String[] D = new String[6];
        int d = 0;
        String[] E = new String[6];
        int e = 0;
        String[] F = new String[6];
        int f = 0;
        String[] G = new String[6];
        int g = 0;
        String[] H = new String[6];
        int h = 0;
        String[] I = new String[6];
        int ii = 0;
        String[] J = new String[6];
        int jj = 0;
        String[] lotto = new String[6];

        System.out.println("[로또 당첨 프로그램]");
        System.out.println();

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            do {
                for (int j = (6 * i) - 6; j <= (6 * i) - 1; j++) {
                    int rdnum = rd.nextInt(46);
                    String rdn = String.format("%02d", rdnum);
                    if (rdn.equals("00")) {
                        do {
                            int rdnum1 = rd.nextInt(46);
                            String rdn1 = String.format("%02d", rdnum1);
                            rdn = rdn1;
                        } while (rdn.equals("00"));
                    }
                    NUM[j] = rdn;
                }
            } while (NUM[(6 * i) - 6].equals(NUM[(6 * i) - 5]) || NUM[(6 * i) - 6].equals(NUM[(6 * i) - 4]) || NUM[(6 * i) - 6].equals(NUM[(6 * i) - 3]) ||
                    NUM[(6 * i) - 6].equals(NUM[(6 * i) - 2]) || NUM[(6 * i) - 6].equals(NUM[(6 * i) - 1]) || NUM[(6 * i) - 5].equals(NUM[(6 * i) - 4]) ||
                    NUM[(6 * i) - 5].equals(NUM[(6 * i) - 3]) || NUM[(6 * i) - 5].equals(NUM[(6 * i) - 2]) || NUM[(6 * i) - 5].equals(NUM[(6 * i) - 1]) ||
                    NUM[(6 * i) - 4].equals(NUM[(6 * i) - 3]) || NUM[(6 * i) - 4].equals(NUM[(6 * i) - 2]) || NUM[(6 * i) - 4].equals(NUM[(6 * i) - 1]) ||
                    NUM[(6 * i) - 3].equals(NUM[(6 * i) - 2]) || NUM[(6 * i) - 3].equals(NUM[(6 * i) - 1]) || NUM[(6 * i) - 2].equals(NUM[(6 * i) - 1])
            );

        }
        System.arraycopy(NUM, 0, A, 0, 6);
        System.arraycopy(NUM, 6, B, 0, 6);
        System.arraycopy(NUM, 12, C, 0, 6);
        System.arraycopy(NUM, 18, D, 0, 6);
        System.arraycopy(NUM, 24, E, 0, 6);
        System.arraycopy(NUM, 30, F, 0, 6);
        System.arraycopy(NUM, 36, G, 0, 6);
        System.arraycopy(NUM, 42, H, 0, 6);
        System.arraycopy(NUM, 48, I, 0, 6);
        System.arraycopy(NUM, 54, J, 0, 6);

        System.out.println(lottonum[0] + "\t" + A[0] + "," + A[1] + "," + A[2] + "," + A[3] + "," + A[4] + "," + A[5]);
        if (num >= 2) {
            System.out.println(lottonum[1] + "\t" + B[0] + "," + B[1] + "," + B[2] + "," + B[3] + "," + B[4] + "," + B[5]);
        }
        if (num >= 3) {
            System.out.println(lottonum[2] + "\t" + C[0] + "," + C[1] + "," + C[2] + "," + C[3] + "," + C[4] + "," + C[5]);
        }
        if (num >= 4) {
            System.out.println(lottonum[3] + "\t" + D[0] + "," + D[1] + "," + D[2] + "," + D[3] + "," + D[4] + "," + D[5]);
        }
        if (num >= 5) {
            System.out.println(lottonum[4] + "\t" + E[0] + "," + E[1] + "," + E[2] + "," + E[3] + "," + E[4] + "," + E[5]);
        }
        if (num >= 6) {
            System.out.println(lottonum[5] + "\t" + F[0] + "," + F[1] + "," + F[2] + "," + F[3] + "," + F[4] + "," + F[5]);
        }
        if (num >= 7) {
            System.out.println(lottonum[6] + "\t" + G[0] + "," + G[1] + "," + G[2] + "," + G[3] + "," + G[4] + "," + G[5]);
        }
        if (num >= 8) {
            System.out.println(lottonum[7] + "\t" + H[0] + "," + H[1] + "," + H[2] + "," + H[3] + "," + H[4] + "," + H[5]);
        }
        if (num >= 9) {
            System.out.println(lottonum[8] + "\t" + I[0] + "," + I[1] + "," + I[2] + "," + I[3] + "," + I[4] + "," + I[5]);
        }
        if (num >= 10) {
            System.out.println(lottonum[9] + "\t" + J[0] + "," + J[1] + "," + J[2] + "," + J[3] + "," + J[4] + "," + J[5]);
        }

        System.out.println();
        do {
            for (int j = 0; j <= 5; j++) {
                int rdnum = rd.nextInt(46);
                String rdn = String.format("%02d", rdnum);
                if (rdn.equals("00")) {
                    do {
                        int rdnum1 = rd.nextInt(46);
                        String rdn1 = String.format("%02d", rdnum1);
                        rdn = rdn1;
                    } while (rdn.equals("00"));
                }
                lotto[j] = rdn;
            }
        } while (lotto[0].equals(lotto[1]) || lotto[0].equals(lotto[2]) || lotto[0].equals(lotto[3]) || lotto[0].equals(lotto[4]) || lotto[0].equals(lotto[5]) ||
                lotto[1].equals(lotto[2]) || lotto[1].equals(lotto[3]) || lotto[1].equals(lotto[4]) || lotto[1].equals(lotto[5]) || lotto[2].equals(lotto[3]) ||
                lotto[2].equals(lotto[4]) || lotto[2].equals(lotto[5]) || lotto[3].equals(lotto[4]) || lotto[3].equals(lotto[5]) || lotto[4].equals(lotto[5])
        );

        System.out.println("[로또 발표]");
        System.out.println("\t" + lotto[0] + "," + lotto[1] + "," + lotto[2] + "," + lotto[3] + "," + lotto[4] + "," + lotto[5]);


        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lotto[i].equals(A[j])) {
                    a++;
                }
                if (lotto[i].equals(B[j])) {
                    b++;
                }
                if (lotto[i].equals(C[j])) {
                    c++;
                }
                if (lotto[i].equals(D[j])) {
                    d++;
                }
                if (lotto[i].equals(E[j])) {
                    e++;
                }
                if (lotto[i].equals(F[j])) {
                    f++;
                }
                if (lotto[i].equals(G[j])) {
                    g++;
                }
                if (lotto[i].equals(H[j])) {
                    h++;
                }
                if (lotto[i].equals(I[j])) {
                    ii++;
                }
                if (lotto[i].equals(J[j])) {
                    jj++;
                }
            }
        }

        System.out.println("[내 로또 결과]");
        System.out.println(lottonum[0] + "\t" + A[0] + "," + A[1] + "," + A[2] + "," + A[3] + "," + A[4] + "," + A[5] + " => " + a + "개 일치");
        if (num >= 2) {
            System.out.println(lottonum[1] + "\t" + B[0] + "," + B[1] + "," + B[2] + "," + B[3] + "," + B[4] + "," + B[5] + " => " + b + "개 일치");
        }
        if (num >= 3) {
            System.out.println(lottonum[2] + "\t" + C[0] + "," + C[1] + "," + C[2] + "," + C[3] + "," + C[4] + "," + C[5] + " => " + c + "개 일치");
        }
        if (num >= 4) {
            System.out.println(lottonum[3] + "\t" + D[0] + "," + D[1] + "," + D[2] + "," + D[3] + "," + D[4] + "," + D[5] + " => " + d + "개 일치");
        }
        if (num >= 5) {
            System.out.println(lottonum[4] + "\t" + E[0] + "," + E[1] + "," + E[2] + "," + E[3] + "," + E[4] + "," + E[5] + " => " + e + "개 일치");
        }
        if (num >= 6) {
            System.out.println(lottonum[5] + "\t" + F[0] + "," + F[1] + "," + F[2] + "," + F[3] + "," + F[4] + "," + F[5] + " => " + f + "개 일치");
        }
        if (num >= 7) {
            System.out.println(lottonum[6] + "\t" + G[0] + "," + G[1] + "," + G[2] + "," + G[3] + "," + G[4] + "," + G[5] + " => " + g + "개 일치");
        }
        if (num >= 8) {
            System.out.println(lottonum[7] + "\t" + H[0] + "," + H[1] + "," + H[2] + "," + H[3] + "," + H[4] + "," + H[5] + " => " + h + "개 일치");
        }
        if (num >= 9) {
            System.out.println(lottonum[8] + "\t" + I[0] + "," + I[1] + "," + I[2] + "," + I[3] + "," + I[4] + "," + I[5] + " => " + ii + "개 일치");
        }
        if (num >= 10) {
            System.out.println(lottonum[9] + "\t" + J[0] + "," + J[1] + "," + J[2] + "," + J[3] + "," + J[4] + "," + J[5] + " => " + jj + "개 일치");
        }



    }
}
