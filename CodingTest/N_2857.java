package CodingTest;

import java.util.Scanner;

//FBI 문제
public class N_2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FBI[] = new String[5];
        int cnt =0;
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            FBI [i] = name;
        }
        for(int i=0; i<5; i++){
            if(FBI[i].contains("FBI")){
                System.out.print(i+1+" ");
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println("HE GOT AWAY!");
        }

    }
}
