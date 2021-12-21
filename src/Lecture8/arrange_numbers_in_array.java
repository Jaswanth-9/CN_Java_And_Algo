package Lecture8;
/*
Arrange Numbers In Array
Send Feedback
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
Note:
You need not print the array. You only need to populate it.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains an integer 'N'.
Output Format :
For each test case, print the elements of the arra/listy separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2
 */
import java.util.Scanner;
import java.util.ArrayList;
public class arrange_numbers_in_array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=t; i++) {
            int n = s.nextInt();
            list.add(n);
        }
            for(int j=0; j<list.size(); j++){
                int m = list.get(j);
                if(m%2==0){
                    for(int l=1; l<m; l=l+2){
                        arr.add(l);
                    }
                    for(int k=m; k>0; k=k-2){
                        arr.add(k);
                    }
                }
                else{
                    for(int b=1; b<=m; b=b+2){
                        arr.add(b);
                    }
                    for(int c=m-1; c>0; c=c-2){
                        arr.add(c);
                    }
                }
                for(int a=0; a<arr.size(); a++){
                    System.out.print(arr.get(a)+" ");
                }
                System.out.println();
                arr.clear();
            }
        }
    }
