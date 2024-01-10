package CodingTest;

import java.util.Scanner;

public class N_1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D= sc.nextInt(); //대각선의 길이
        int H = sc.nextInt(); //높이의 비율
        int W= sc.nextInt();  // 너비 비율

        double result = Math.sqrt(1.0*D*D/(H*H+W*W));
        System.out.println((int)Math.floor(result*H)+" "+(int)Math.floor(result*W));

    }
}
