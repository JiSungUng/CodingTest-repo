package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class N_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        int array[] = new int[Num];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
