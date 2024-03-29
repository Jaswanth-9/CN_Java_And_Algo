package Lecture5;

import java.util.Scanner;

/*
Code : Interesting Alphabets
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */
public class interesting_alphabets {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for( int i = 0; i<=n;i++){
            for(int j=0; j<i;j++){
                int m = n-i+j;
                int c = 65+m;
                char ch = (char) c;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
