package CodingTest;

import java.util.Scanner;

//팰린드롬수
// 어떤 단어를 뒤에서 읽어도 똑같으면 플린드롬
//ex_ 121 1221 등  0은 제외 ,  팰린드롬수가 맞으면 yes , 아니면 no
public class N_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }else{
                int cnt = 0;
                String str = Integer.toString(n);
                for(int i = 0; i < str.length()/2; i++){
                    if(str.charAt(i) == str.charAt(str.length()-1-i)){
                        cnt++;
                    }
                }
                if(cnt == str.length()/2){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }

    }
}
