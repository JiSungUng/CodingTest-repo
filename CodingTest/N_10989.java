package CodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//수 정렬하기 수정 하기.????  나중에 꼭 풀게요.......
public class N_10989 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
    }
}