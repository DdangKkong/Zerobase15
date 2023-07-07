/*
        이원우
*/

import java.util.Scanner;

public class WWjavastudy02 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        Scanner sc = new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int pay = sc.nextInt();

        int cashback = pay / 10;
        if (cashback > 300) {
            cashback = 300;
        } else {
            int i = cashback / 100;
            cashback = i * 100;
        }
        System.out.println("결제 금액은 " + pay + "원 이고, 캐시백은 " + cashback + "원 입니다.");
        sc.close();
    }
}
