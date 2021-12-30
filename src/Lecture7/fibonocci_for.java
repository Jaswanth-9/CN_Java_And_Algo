package Lecture7;
import java.util.Scanner;
public class fibonocci_for {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        if (N >= 1 && N <= 10000) {
            for( int i=1; i<N; i++){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println(n3);
        }
    }
}
