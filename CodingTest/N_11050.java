package CodingTest;

import java.util.Scanner;

//이항계수 문제
// 자연수 N과 정수 K 가 주어졌을 때 이항계수 (N/K)를 구하는 프로그램을 작성
public class N_11050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();        // 자연수 N
        int k = scan.nextInt();        // 정수 K

        int result = factorial(n) / (factorial(n - k) * factorial(k));    // 이항 계수 (NK)
        System.out.println(result);
    }

    // 팩토리얼
    public static int factorial(int n) {
        if (n <= 1)
            return 1; //1
        else
            return factorial(n - 1) * n; //팩토리얼
    }

}
