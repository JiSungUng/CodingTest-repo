package CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//더하기사이클
public class N_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = N;

        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;

            if (copy == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
