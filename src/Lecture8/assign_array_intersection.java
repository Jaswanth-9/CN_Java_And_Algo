package Lecture8;
/*
Array Intersection
Send Feedback
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first the array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
For each test case, print the intersection elements in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7
2
10 10
1
10
Sample Output 1 :
2 4 3
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.
 */
import java.util.Scanner;
public class assign_array_intersection {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[][] time = new int[t-1][];
        for(int i=0; i<t; i++){
            int s1 = s.nextInt();
            int[] arr1 = new int[s1];
            for(int j=0; j<s1; j++){
                int s2 = s.nextInt();
                arr1[j] = s2;
            }
            int s3 = s.nextInt();
            int[] arr2 = new int[s3];
            for(int k=0; k<s3; k++){
                int s4 = s.nextInt();
                arr2[k] = s4;
            }
            for(int l=0; l<arr1.length; l++){
                for(int m=0; m<arr2.length; m++){
                    if(arr1[l] == arr2[m]){
                        int c = 0;
                        time[i][c] = arr2[m];
                        for(int z=m;z<arr2.length; z++){
                            arr2[m] = arr2[m+1];
                        }
                        c++;
                    }
                }
            }
        }
        for(int h=0; h<t; h++){
            for(int sf=0; sf<=time[h].length; sf++){
                System.out.print(time[h][sf]+" ");
            }
            System.out.println();
        }
    }
}
