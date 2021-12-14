package Lecture4;
/*
Factors
Send Feedback
Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Sample Input 2 :
11
Sample Output 2 :


Explanation of Sample Output 2 :
No output as 11 is prime having factors as 1 and 11 only
 */
import java.util.Scanner;
public class assign_factors {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        if(s1>=0 && s1<=10000) {
        for(int i =2; i<=(s1/2); i++){
                int r = s1%i;
                if(r == 0) System.out.print(i+" ");
            }
        }
        else System.out.println("Enter value between 0 and 10000");
    }
}
