package CodingTest;

import java.util.Scanner;

//윷놀이 문제
public class N_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] =new int[4];
        String b [] = new String[3];
        int cnt = 0;

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                int N = sc.nextInt();
                a[j] = N;

            }

            for (int k = 0; k < a.length; k++) {
                if (a[k] == 1) {
                    cnt++;
                }
            }

            if (cnt ==0){
                b[i]="D";

            }
            else if (cnt ==1){
              b[i]="C";

            }
            else if (cnt ==2){
                b[i]="B";
            }
            else if (cnt ==3){
                b[i]="A";
            }
            else if (cnt ==4){
                b[i]="E";
            }
            cnt =0;

        }
        for(int i=0; i<3;i++){
            System.out.println(b[i]);
        }

    }
}
