package Lecture7_test;
import java.util.Scanner;
import java.lang.Math;
public class test3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String s1 = String.valueOf(n);
        int l = s1.length();
        int z = 0;
        int d = n;
        while(d >= 1){
            int r = d%10;
            z = z + (int)Math.pow(r,l);
             d = d/10;
        }
        if(z==n) System.out.println("true");
        else System.out.println("false");
    }
}
