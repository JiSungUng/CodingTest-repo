package CodingTest;

import java.math.BigInteger;
import java.util.Scanner;
//1271번 엄청난 부자 문제
public class N_1271 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            BigInteger n = in.nextBigInteger();
            BigInteger m = in.nextBigInteger();
            in.close();
            System.out.println(n.divide(m));
            System.out.println(n.remainder(m));



    }
}

