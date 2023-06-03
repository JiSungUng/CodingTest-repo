package CodingTest;
//ACM호텔문제
//1.엘레베이터로부터 가까운 거리부터 배정
//2.거리가 같은 경우 낮은 층수부터 배정
import java.util.Scanner;

public class  N_10250{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();	// 테스트 케이스


        for(int i = 0; i < T; i++) {

            int H = in.nextInt();
            int W= in.nextInt();
            int N = in.nextInt();

            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));

            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}