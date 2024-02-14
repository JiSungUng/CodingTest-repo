package CodingTest;

import java.util.Scanner;

//파티가 끝나고 난 뒤
public class N_2845 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] result = new int[5];

        int p = scanner.nextInt();
        int area = scanner.nextInt();
        int cnt = p * area;

        for (int i = 0; i < 5; i++) {
            int temp = scanner.nextInt();
            result[i] = temp - cnt;
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}