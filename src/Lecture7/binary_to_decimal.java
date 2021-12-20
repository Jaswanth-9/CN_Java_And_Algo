package Lecture7;
/*
Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
 */
import java.util.Scanner;
import java.lang.Math;
public class binary_to_decimal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        int a = s1;
        int v = 0;
        int p =0;
        while(a>0){
            int r = a%10;
            a = a/10;
            v = v + r * (int)(Math.pow(2,p++));
        }
        System.out.println(v);
    }
}
