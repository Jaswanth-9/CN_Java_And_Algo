package Lecture8;

import java.util.ArrayList;
import java.util.Scanner;

/*
Find Duplicate
Send Feedback
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Note :
Duplicate number is always present in the given array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the duplicate element in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
 */
import java.util.Scanner;
import java.util.ArrayList;
public class assign_find_duplicate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        for(int i=1; i<=t; i++){
            int n1 = s.nextInt();
            for(int j=0; j<n1; j++){
                int v = s.nextInt();
                a1.add(v);
            }
          a2 = a1;
            for(int x=0; x<a1.size(); x++){
                for(int y=x+1; y<a2.size(); y++){
                    if(a1.get(x) == a2.get(y)){
                        a3.add(a2.get(y));
                        System.out.print(a2.get(y)+" ");
                    }
                }
            }
        }
    }
}
