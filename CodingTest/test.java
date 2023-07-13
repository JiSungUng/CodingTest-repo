package CodingTest;

public class test {
    public static void main(String[] args) {
        int i = 0, hap=0;
        String a="Technology";
        do{
            if(a.charAt(i)=='o')
                hap+=i; // 5랑 7
            i++;

        }while(i<a.length());
        System.out.printf("%d",hap);
    }
}
