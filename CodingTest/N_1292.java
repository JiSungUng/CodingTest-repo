package CodingTest;

import java.util.Scanner;

public class N_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum = 0;
        int cnt =0;
        int q =1;
        int num [] = new int[b];
        for(int i=0;i<b;i++){
            num[i]= q;
            cnt++;
            if(cnt==q){
                q+=1;
                cnt =0;
            }
        }

        for(int i =a-1;i<b;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
