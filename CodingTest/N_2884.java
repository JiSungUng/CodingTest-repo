package CodingTest;

import java.util.Scanner;

public class N_2884 {
//알람시계   현재 시간보다 45분빠르게 설정

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H; // 시간
        int M; //분

        H=sc.nextInt();
        M=sc.nextInt();


        M=M-45;  //45분 을 빼줌.
        if(M<0){     //분이 0보다 작으면 1시간을 빼주고 60분 추가
            H=H-1;
            M=M+60;

        }
        if(H<0){  //시간이 0시 보다 작으면 24시간 추가
            H=H+24;
        }

        System.out.println(H+" "+M);
    }
}
