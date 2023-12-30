package CodingTest;

import java.util.Scanner;

//플러그문제
public class N_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tot=0;
        for (int i=0;i<N;i++){
            int a = sc.nextInt();
            tot+=a;
        }
        System.out.println(tot-(N-1));
    }
}
