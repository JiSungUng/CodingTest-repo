package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

//일곱 난쟁이
public class N_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sh[] = new int[9];
        int a=0 ,b=0;
        int sum =0;
        for(int i=0;i<9;i++){
            sh[i]= sc.nextInt();
            sum +=sh[i];
        }
        Arrays.sort(sh);
        for (int i = 0; i < sh.length-1; i++) {
            for (int j = i+1; j < sh.length; j++) {
                if(sum-sh[i]-sh[j]==100){
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        for(int i=0;i<sh.length;i++){
            if(i!=a && i!=b) {
                System.out.println(sh[i]);
            }

        }
    }
}
