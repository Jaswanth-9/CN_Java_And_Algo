package Lecture6;
/*
Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4


The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
       1
      232
     34543
    4567654
   567898765
Sample Input 2:
4
Sample Output 2:
        1
       232
      34543
     4567654
 */
import java.util.Scanner;
public class triangle_of_numbers {
    public static void main(String[] rgs){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x =0;
        for(int i=1;i<=n;i++){
            int g = 0;
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=i; k<(2*i); k++){
                System.out.print(k);
            }
            for(int m=i+2;m<(2*i)+1;m++) {
                System.out.print(2*x-g);
                g++;
            }
            x++;
            System.out.println();
        }
    }
}
