package Lecture4;
/*
Find Character Case
Send Feedback
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet
Input format :
Single Character
Output format :
1 or 0 or -1
Constraints :
Input can be any character
Sample Input 1 :
v
Sample Output 1 :
0
Sample Input 2 :
V
Sample Output 2 :
1
Sample Input 3 :
#
Sample Output 3 :
-1
 */
import java.util.Scanner;
public class find_character {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char s1 = s.next().charAt(0);
        if(s1>=65 && s1<=90) System.out.println("1");
        else if ( s1>=97 && s1<=122) System.out.println("0");
        else System.out.println("-1");
    }
}
