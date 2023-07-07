/*
        이원우
*/

import java.util.Random;
import java.util.Scanner;

public class WWjavastudy04 {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int gdnum = 0;

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        sc.nextLine();

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();
        sc.nextLine();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.nextLine();

        while (!gender.equals("m") && !gender.equals("f")) {
            System.out.println("(m 또는 f 으로 답해주세요)");
            System.out.print("성별을 입력해 주세요.(m/f):");
            gender = sc.nextLine();
            if (gender.equals("m") || gender.equals("f")){
                break;
            }
        }
        if (gender.equals("m")){
            gdnum = 3;
        } else if (gender.equals("f")) {
            gdnum = 4;
        }

        String styear = Integer.toString(year);
        String year2 = styear.substring(styear.length() - 2);

        int min = 1;
        int max = 999999;
        int num = rd.nextInt(max - min + 1) + min;

        String rdnum = String.format("%06d", num);
        String Month = String.format("%02d", month);

        System.out.println(year2 + Month + day + "-" + gdnum + rdnum);

    }
}
