package CodingTest;

import java.util.Scanner;

//달팽이는 계속 올라간다.!
public class N_2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, v; // a 낮동안 올라가는 길이 ,b 밤동안 내려가는 길이 ,v 높이
        a = sc.nextInt();
        b = sc.nextInt();
        v = sc.nextInt();

        int day = (v - b) / (a - b);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((v - b) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }
}