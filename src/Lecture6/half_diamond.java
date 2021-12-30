package Lecture6;
/*
Half Diamond Pattern
Send Feedback
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.

Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
1
121
12321
121
1
*
Sample Input 2 :
 5
Sample Output 2 :
*
1
121
12321
1234321
123454321
1234321
12321
121
1
*
 */
import java.util.Scanner;
public class half_diamond {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0) System.exit(0);
        for(int i=0; i<=n; i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            for(int z=1; z<=i;z=z+i) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            for(int z=1; z<=i;z=z+i) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
