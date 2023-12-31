package CodingTest;
//저작권
import java.util.Scanner;

public class N_2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 곡수
        int b= sc.nextInt(); // 평균

        int i = (b - 1) * a + 1;
        System.out.println(i);
    }
}
