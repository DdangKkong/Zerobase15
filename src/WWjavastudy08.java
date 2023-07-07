/*
        이원우
*/

import java.util.Scanner;

public class WWjavastudy08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = 0; int c1 = 12000000; String d1 = String.format("%10d", c1);
        long a2 = 0; int c2 = 34000000; String d2 = String.format("%10d", c2);
        long a3 = 0; int c3 = 42000000; String d3 = String.format("%10d", c3);
        long a4 = 0; int c4 = 62000000; String d4 = String.format("%10d", c4);
        long a5 = 0; int c5 = 150000000; String d5 = String.format("%10d", c5);
        long a6 = 0; int c6 = 200000000; String d6 = String.format("%10d", c6);
        long a7 = 0; int c7 = 500000000; String d7 = String.format("%10d", c7);
        long a8 = 0;
        long a9 = 0;
        long b2 = 0;

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        long earn = sc.nextLong();
        sc.nextLine();

        if (earn <= 12000000) {
            a1 = earn * 6 / 100;
            String earn1 = String.format("%10d", earn);
            String A1  = String.format("%10d", a1);
            System.out.println(earn1 + "\t* 6% =\t" + A1);
            b2 = a1;
        }

        if (12000000 < earn && earn <= 46000000){
            a1 = 12000000 * 6 / 100;
            String A1 = String.format("%10d", a1);
            long b1 = earn - 12000000;
            String B1 = String.format("%10d", b1);
            a2 = b1 * 15 / 100;
            String A2 = String.format("%10d", a2);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(B1 + "\t* 15% =\t" + A2);
            b2 = (earn / 100 * 15) - 1080000;
        }

        if (46000000 < earn && earn <= 88000000) {
            a1 = 12000000 * 6 / 100;
            a2 = 34000000 * 15 / 100;
            long b1 = earn - 46000000;
            a3 = b1 * 24 / 100;
            String B1 = String.format("%10d", b1);
            String A1 = String.format("%10d", a1);
            String A2 = String.format("%10d", a2);
            String A3 = String.format("%10d", a3);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(d2 + "\t* 15% =\t" + A2);
            System.out.println(B1 + "\t* 24% =\t" + A3);
            b2 = (earn / 100 * 24) - 5220000;
        }

        if (88000000 < earn && earn <= 150000000) {
            a1 = 12000000 * 6 / 100;
            a2 = 34000000 * 15 / 100;
            a3 = 42000000 * 24 / 100;
            long b1 = earn - 88000000;
            a4 = b1 * 35 / 100;
            String B1 = String.format("%10d", b1);
            String A1 = String.format("%10d", a1);
            String A2 = String.format("%10d", a2);
            String A3 = String.format("%10d", a3);
            String A4 = String.format("%10d", a4);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(d2 + "\t* 15% =\t" + A2);
            System.out.println(d3 + "\t* 24% =\t" + A3);
            System.out.println(B1 + "\t* 35% =\t" + A4);
            b2 = (earn / 100 * 35) - 14900000;
        }

        if (150000000 < earn && earn <= 300000000) {
            a1 = 12000000 * 6 / 100;
            a2 = 34000000 * 15 / 100;
            a3 = 42000000 * 24 / 100;
            a4 = 62000000 / 100 * 35;
            long b1 = earn - 150000000;
            a5 = b1 * 38 / 100;
            String B1 = String.format("%10d", b1);
            String A1 = String.format("%10d", a1);
            String A2 = String.format("%10d", a2);
            String A3 = String.format("%10d", a3);
            String A4 = String.format("%10d", a4);
            String A5 = String.format("%10d", a5);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(d2 + "\t* 15% =\t" + A2);
            System.out.println(d3 + "\t* 24% =\t" + A3);
            System.out.println(d4 + "\t* 35% =\t" + A4);
            System.out.println(B1 + "\t* 38% =\t" + A5);
            b2 = (earn / 100 * 38) - 19400000;
        }

        if (300000000 < earn && earn <= 500000000) {
            a1 = 12000000 * 6 / 100;
            a2 = 34000000 * 15 / 100;
            a3 = 42000000 * 24 / 100;
            a4 = 62000000 / 100 * 35;
            a5 = 150000000 / 100 * 38;
            long b1 = earn - 300000000;
            a6 = b1 * 40 / 100;
            String B1 = String.format("%10d", b1);
            String A1 = String.format("%10d", a1);
            String A2 = String.format("%10d", a2);
            String A3 = String.format("%10d", a3);
            String A4 = String.format("%10d", a4);
            String A5 = String.format("%10d", a5);
            String A6 = String.format("%10d", a6);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(d2 + "\t* 15% =\t" + A2);
            System.out.println(d3 + "\t* 24% =\t" + A3);
            System.out.println(d4 + "\t* 35% =\t" + A4);
            System.out.println(d5 + "\t* 38% =\t" + A5);
            System.out.println(B1 + "\t* 40% =\t" + A6);
            b2 = (earn / 100 * 40) - 25400000;
        }

        if (500000000 < earn && earn <= 1000000000) {
            a1 = 12000000 * 6 / 100;
            a2 = 34000000 * 15 / 100;
            a3 = 42000000 * 24 / 100;
            a4 = 62000000 / 100 * 35;
            a5 = 150000000 / 100 * 38;
            a6 = 200000000 / 100 * 40;
            long b1 = earn - 500000000;
            a7 = b1 * 42 / 100;
            String B1 = String.format("%10d", b1);
            String A1 = String.format("%10d", a1);
            String A2 = String.format("%10d", a2);
            String A3 = String.format("%10d", a3);
            String A4 = String.format("%10d", a4);
            String A5 = String.format("%10d", a5);
            String A6 = String.format("%10d", a6);
            String A7 = String.format("%10d", a7);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(d2 + "\t* 15% =\t" + A2);
            System.out.println(d3 + "\t* 24% =\t" + A3);
            System.out.println(d4 + "\t* 35% =\t" + A4);
            System.out.println(d5 + "\t* 38% =\t" + A5);
            System.out.println(d6 + "\t* 40% =\t" + A6);
            System.out.println(B1 + "\t* 42% =\t" + A7);
            b2 = (earn / 100 * 42) - 35400000;
        }

        if (1000000000 < earn) {
            a1 = 12000000 * 6 / 100;
            a2 = 34000000 * 15 / 100;
            a3 = 42000000 * 24 / 100;
            a4 = 62000000 / 100 * 35;
            a5 = 150000000 / 100 * 38;
            a6 = 200000000 / 100 * 40;
            a7 = 500000000 / 100 * 42;
            long b1 = earn - 1000000000;
            a8 = b1 * 45 / 100;
            String B1 = String.format("%10d", b1);
            String A1 = String.format("%10d", a1);
            String A2 = String.format("%10d", a2);
            String A3 = String.format("%10d", a3);
            String A4 = String.format("%10d", a4);
            String A5 = String.format("%10d", a5);
            String A6 = String.format("%10d", a6);
            String A7 = String.format("%10d", a7);
            String A8 = String.format("%10d", a8);
            System.out.println(d1 + "\t*  6% =\t" + A1);
            System.out.println(d2 + "\t* 15% =\t" + A2);
            System.out.println(d3 + "\t* 24% =\t" + A3);
            System.out.println(d4 + "\t* 35% =\t" + A4);
            System.out.println(d5 + "\t* 38% =\t" + A5);
            System.out.println(d6 + "\t* 40% =\t" + A6);
            System.out.println(d7 + "\t* 42% =\t" + A7);
            System.out.println(B1 + "\t* 45% =\t" + A8);
            b2 = (earn / 100 * 45) - 65400000;
        }

        a9 = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8;
        String B2 = String.format("%10d", b2);
        String A9 = String.format("%10d", a9);

        System.out.println();
        System.out.println("[세율에 의한 세금]:\t\t\t" + A9);
        System.out.println("[누진공제 계산에 의한 세금]:\t" + B2);

    }
}
