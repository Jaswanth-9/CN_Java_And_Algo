package Lecture6;
/*
Sum Pattern
Send Feedback
Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 */
import java.util.Scanner;
public class sum_pattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            int m = 0;
            for(int j=1;j<=i;j++){
                if(i==j){
                    m += j;
                    System.out.print(j+"="+m);
                }
                else System.out.print(j+"+");
                m += j;
            }
            System.out.println();
        }
    }
}
