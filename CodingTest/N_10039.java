package CodingTest;

import java.util.Scanner;

public class N_10039 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int total=0;
        for(int i=0;i<5;i++){
            int a =sc.nextInt();
            if(a>=0&&a<=100&&a%5==0){

                arr[i]=a;
                if(a<40){
                    arr[i]=40;
                }
                total+=arr[i];
            }


        }
        System.out.println(total/5);
    }
}
