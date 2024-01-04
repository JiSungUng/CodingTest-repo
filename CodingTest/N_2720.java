package CodingTest;

import java.util.Scanner;

//세탁소 사장 동혁 문제
public class N_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int Q =25;  // Quarter
        int D = 10; // Dime
        int N = 5;  // Nickel
        int P = 1;  // Penny
        int result[][] = new int[T][4];
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            result[i][0]= C/Q;
            result[i][1]=C%Q/D;
            result[i][2]=C%Q%D/N;
            result[i][3]=C%Q%D%N/P;

        }

        //System.out.println(result[2][3]);

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
