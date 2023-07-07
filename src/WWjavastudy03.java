/*
        이원우
*/

import java.util.Scanner;

public class WWjavastudy03 {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();
        sc.nextLine();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String sale1 = sc.nextLine();

        while (!sale1.equals("y") && !sale1.equals("n")) {
            System.out.println("(y 또는 n 으로 답해주세요)");
            System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
            sale1 = sc.nextLine();
            if (sale1.equals("y") || sale1.equals("n")){
                break;
            }
        }

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String sale2 = sc.nextLine();

        while (!sale2.equals("y") && !sale2.equals("n")) {
            System.out.println("(y 또는 n 으로 답해주세요)");
            System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
            sale2 = sc.nextLine();
            if (sale2.equals("y") || sale2.equals("n")){
                break;
            }
        }

        int payment;
        if (age < 3) {
            payment = 0;
        } else {
            if (age < 13) {
                payment = 4000;
            } else if (time > 17) {
                payment = 4000;
            } else {
                if (sale1.equals("y")) {
                    payment = 8000;
                } else if (sale2.equals("y")) {
                    payment = 8000;
                } else {
                    payment = 10000;
                }
            }
        }
        System.out.println("입장료: " + payment);

    }
}
