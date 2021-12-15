package Lecture5;
/*
Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
 */
import java.util.Scanner;
public class alpha_pattern {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n <= 26 && n >= 1) {
            for (int i=0; i<n; i++) {
                for (int j=65;j<(65+i+1);j++)
                {
                    int c = 65 + i;
                    char ch = (char) c;
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}
