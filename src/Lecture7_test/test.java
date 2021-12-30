package Lecture7_test;
import java.util.Scanner;
public class test {
            public static void main(String[] args) {
            // Write your code here
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            for(int i=1; i<=N; i++){
                for(int j=N; j>=1; j--){
                    if(i==j)  System.out.print("*");
                    else System.out.print(j);
                }
                System.out.println();
            }
        }
    }

