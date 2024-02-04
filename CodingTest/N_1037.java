package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

//약수
public class N_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int factors [] =new int[count];
        for (int i = 0; i < count; i++) {
            int num= sc.nextInt();
            factors[i] = num;
        }
        Arrays.sort(factors);
        System.out.println(factors[0]*factors[count-1]);
    }
}
