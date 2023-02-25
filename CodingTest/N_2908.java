package CodingTest;

import java.util.Scanner;


public class N_2908 {
//세자리 수 두개 입력 후 거꾸로 바꾼다.
//그 후 큰 수를 출력

    public static int solution(int n) {

        int answer = 0;

        while (n != 0) {
            answer = answer * 10 + n % 10;
            n /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int num1=solution(a);
        int num2=solution(b);

            if(num1>num2){
                System.out.println(num1);
            }else {
                System.out.println(num2);
            }




    }
}
