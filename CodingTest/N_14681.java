package CodingTest;

import java.util.Scanner;

// 4분면 맞추기
public class N_14681 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int y= sc.nextInt();

        if(x>0&&y>0){// x가 0보다 크고 y가 0보다 클 경우.
            System.out.println("1");
        }
        if(x<0&&y>0){ // x가 0보다 작고 y가 0보다 클 경우
            System.out.println("2");
        }
        if(x<0&&y<0){ //x 가 0보다 작고 y는 0보다 작을 경우
            System.out.println("3");
        }
        if(x>0&&y<0){ // x가 0보다 크고 y는 0 보다 작을 경우
            System.out.println("4");
        }
    }
}
