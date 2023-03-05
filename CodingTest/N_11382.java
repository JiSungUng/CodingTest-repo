package CodingTest;

import java.util.Scanner;

//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
// b c의 범위가 1부터 10^12 승 까지니깐
//
//int형의 범위를 초과하기 때문에 long을 써줌.
public class N_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();  //nextInt -> nextLong 으로 해주어야함.
        long b=sc.nextLong();
        long c=sc.nextLong();

        System.out.println(a+b+c);

    }
}
