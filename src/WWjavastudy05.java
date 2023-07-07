/*
        이원우
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class WWjavastudy05 {
    public static void main(String[] args) {
        System.out.println("[달력 출력 프로그램]");
        Scanner sc = new Scanner(System.in);

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        sc.nextLine();

        String[] weekdays = {"일", "월", "화", "수", "목", "금", "토"};

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek dow = date.getDayOfWeek();
        String stdow = dow.toString();
        int lom = date.lengthOfMonth();

        String[] day1 = new String[7];
        String[] day2 = new String[7];
        String[] day3 = new String[7];
        String[] day4 = new String[7];
        String[] day5 = new String[7];
        String[] day6 = new String[7];
        int x = 0;
        int j = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        if (stdow.equals("SUNDAY")) { x = 0;} else if (stdow.equals("MONDAY")) { x = 1;}
        else if (stdow.equals("TUESDAY")) { x = 2;} else if (stdow.equals("WEDNESDAY")) { x = 3;}
        else if (stdow.equals("THURSDAY")) { x = 4;} else if (stdow.equals("FRIDAY")) { x = 5;}
        else if (stdow.equals("SATURDAY")) { x = 6;}

        for (int i = x; i < day1.length; i++) {
            if ( x == 1 ) { for ( int f = 0; f < x; f++) { day1[f] = "  ";}}
            else if ( x == 2 ) { for ( int g = 0; g < x; g++) { day1[g] = "  ";}}
            else if ( x == 3 ) { for ( int h = 0; h < x; h++) { day1[h] = "  ";}}
            else if ( x == 4 ) { for ( int l = 0; l < x; l++) { day1[l] = "  ";}}
            else if ( x == 5 ) { for ( int m = 0; m < x; m++) { day1[m] = "  ";}}
            else if ( x == 6 ) { for ( int n = 0; n < x; n++) { day1[n] = "  ";}}
            String k = String.format("%02d", j);
            day1[i] = k;
            j++;
            a = j;
        }
        for (int i = 0; i < day2.length; i++) {
            String k = String.format("%02d", a);
            day2[i] = k;
            a++;
            b = a;
        }
        for (int i = 0; i < day3.length; i++) {
            String k = String.format("%02d", b);
            day3[i] = k;
            b++;
            c = b;
        }
        for (int i = 0; i < day4.length; i++) {
            String k = String.format("%02d", c);
            day4[i] = k;
            c++;
            d = c;
        }
        for (int i = 0; i < day5.length; i++) {
            String k = String.format("%02d", d);
            if (d > lom) { k = "  ";}
            day5[i] = k;
            d++;
            e = d;
        }
        for (int i = 0; i < day6.length; i++) {
            String k = String.format("%02d", e);
            if (e > lom) { k = "  ";}
            day6[i] = k;
            e++;
        }



        System.out.println();
        System.out.println();

        String stmon = String.format("%02d", month);
        System.out.println("[" + year + "년 " + stmon + "월]");

        for (int w1 = 0; w1 < weekdays.length; w1++) {
            System.out.print(weekdays[w1]);
            if (w1 < weekdays.length - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();

        for (int d1 = 0; d1 < day1.length; d1++) {
            System.out.print(day1[d1]);
            if (d1 < day1.length - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();

        for (int d2 = 0; d2 < day2.length; d2++) {
            System.out.print(day2[d2]);
            if (d2 < day2.length - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();

        for (int d3 = 0; d3 < day3.length; d3++) {
            System.out.print(day3[d3]);
            if (d3 < day3.length - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();

        for (int d4 = 0; d4 < day4.length; d4++) {
            System.out.print(day4[d4]);
            if (d4 < day4.length - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();

        for (int d5 = 0; d5 < day5.length; d5++) {
            System.out.print(day5[d5]);
            if (d5 < day5.length - 1) {
                System.out.print("\t");
            }
        }
        System.out.println();

        for (int d6 = 0; d6 < day6.length; d6++) {
            System.out.print(day6[d6]);
            if (d6 < day6.length - 1) {
                System.out.print("\t");
            }
        }


    }
}
