package Lecture6;
/*
Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4


The dots represent spaces.


Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  **
 ***
Sample Input 2 :
4
Sample Output 2 :
    *
   ***
  *****
 *******
 */
import java.util.Scanner;
public class star_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m =0;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*m+1;k++){
                System.out.print("*");
            }
            System.out.println();
            m++;
        }
    }
}
