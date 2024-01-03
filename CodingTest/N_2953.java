package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//나는 요리사다 문제
public class N_2953 {
    public static void main(String[] args) throws IOException {
      /*  Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int win = 0;
        int winnum=0;
        int tmp[] = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                int num = sc.nextInt();
                cnt += num;

            }
            tmp[i] = cnt;
            cnt = 0;
        }

        for (int i = 0; i < tmp.length-1; i++) {
            if (tmp[i] > tmp[i + 1]) {
                win = tmp[i];
                winnum = i+1;
            }

        }
        System.out.println(winnum+" "+win);
    }

       */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int winner = 1;  // 우승자
        int total = 0;  // 우승자의 점수
        for (int i = 1; i <= 5; i++) {
            st = new StringTokenizer(br.readLine());
            int current = 0;
            while (st.hasMoreTokens()) {
                current += Integer.parseInt(st.nextToken());
            }
            //현재 점수가 우승자의 점수보다 높으면
            if (current > total) {
                winner = i;
                total = current;
            }
        }
        System.out.print(winner + " " + total);

    }
}
