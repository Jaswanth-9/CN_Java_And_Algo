package Array1;
/*
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the sum of the numbers in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
Sample Input 2:
2
5
1 2 3 4 5
3
10 20 30
Sample Output 2:
15
60
 */
import java.util.Scanner;
import java.lang.Math;
public class return_arr_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if (t >= 1 && t <= (int) Math.pow(10, 2)) {
            for (int i = 0; i < t; i++) {
                input_arr();
            }
        }
    }
        public static int input_arr() {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int k = 0;
            int[] arr = new int[N];
            if(N>=0 && N<=(int)Math.pow(10,5)){
                for(int i=0; i<N; i++){
                    int j = s.nextInt();
                    arr[i] = j;
                    k = k + arr[i];
                }
            }
            return k;
        }
}
