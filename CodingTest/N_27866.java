package CodingTest;

//백준 27866 번
// 문자와 문자열
//단어  S 와 정수 i가 주어졌을 때 S 의 i 번째 글자를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class N_27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.next().split("");
        int b = scanner.nextInt();

        System.out.println(a[b-1]);
    }
}