package CodingTest;

import java.util.Scanner;
import java.util.Stack;

//제로 문제
//0일때 가장 최근의 수를 지운다.
public class N_10773 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum=0;
        int k=sc.nextInt();
        Stack<Integer> stack= new Stack<>();

        for(int i=0;i<k;i++){

           int n= sc.nextInt();
           if(n==0){
               stack.pop();
           }else{
               stack.push(n);
           }

        }
        for(int o:stack){
            sum+=o;
        }
        System.out.println(sum);
    }
}
