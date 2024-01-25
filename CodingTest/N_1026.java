package CodingTest;
import java.util.Arrays;
import java.util.Scanner;

//보물
public class N_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int AN[]= new int [N];
        int BN[]= new int [N];

        for(int i=0; i<N;i++){
            AN [i]= sc.nextInt();

        }
        Arrays.sort(AN);
        for(int i=0; i<N;i++){
            BN[i]= sc.nextInt();
        }
        Arrays.sort(BN);
        for(int i=0; i <N; i++){
            sum+=AN[i]*BN[N-1-i];
        }
        System.out.println(sum);
    }
}
