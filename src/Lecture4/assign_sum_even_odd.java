package Lecture4;
/*
Sum of even & odd
Send Feedback
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
 Integer N
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)
Constraints
0 <= N <= 10^8
Sample Input 1:
1234
Sample Output 1:
6 4
Sample Input 2:
552245
Sample Output 2:
8 15
Explanation for Input 2:
For the given input, the even digits are 2, 2 and 4 and if we take the sum of these digits it will come out to be 8(2 + 2 + 4) and similarly, if we look at the odd digits, they are, 5, 5 and 5 which makes a sum of 15(5 + 5 + 5). Hence the answer would be, 8(evenSum) <single space> 15(oddSum)
 */
import java.lang.*;
import java.util.Scanner;
public class assign_sum_even_odd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Long s2 = s.nextLong();
        int rem = 0;
        int even = 0;
        int odd = 0;
        int s1 = 1;
        if(s2>=0 && s2<=100000000){
            s1 = s2.intValue();
            while(s1 != 0){
                rem = s1%10;
                s1 = s1/10;
                if(rem%2 == 0) even = even + rem;
                else odd = odd + rem;
            }
            System.out.println(even+" "+odd);
        }
        else System.exit(0);
    }
}
