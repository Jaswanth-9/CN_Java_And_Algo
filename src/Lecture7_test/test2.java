package Lecture7_test;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {

        /*  Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) System.out.print("*");
                else System.out.print("0");
            }
            System.out.print("*");
            for (int k = N; k > 0; k--) {
                if (k == i) System.out.print("*");
                else System.out.print("0");
            }
            System.out.println();
        }
    }
}
