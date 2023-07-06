package CodingTest;

import java.util.Scanner;

//설탕 배달
public class N_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=0; //봉지 개수



        while(true){
            if(n%5==0){
                System.out.println(n/5+k);
                        break;
            }
          else if (n<0){
                System.out.println(-1);
                break;
            }

            n=n-3; //3kg 하나
            k++;


        }


            }
}
