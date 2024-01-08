package CodingTest;

import java.util.Scanner;

//영수증 문제
public class N_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int sum=0;
        for(int i=0;i<9;i++){
            int num= sc.nextInt();
            sum+=num;
        }
        System.out.println(total-sum);
    }
}
