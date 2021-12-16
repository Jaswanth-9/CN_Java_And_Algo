package Lecture6;
/*
Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
 */
import java.util.Scanner;
public class odd_square {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int l=0;
            int m=0;
            for(int j=i;j<n;j++){
                System.out.print(1+(2*i)+(2*l));
                l++;
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+m);
                m++;
            }
            System.out.println();
        }
    }
}
