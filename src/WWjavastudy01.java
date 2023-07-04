/*
        이원우
*/

public class WWjavastudy01 {
    public static void main(String[] args) {

        System.out.println("[구구단 출력]");

        int i = 1;
        int j = 1;
        int answer = 0;

        for( i=1 ; i<10 ; i++ ){
            for( j=1 ; j<10 ; j++){
                String sn = String.format("%02d", i);
                String en = String.format("%02d", j);
                answer = i * j;
                String ans = String.format("%02d", answer);
                System.out.print(sn + " x " + en + " = " + ans + "    ");
            }
            System.out.println();
        }
      }
    }