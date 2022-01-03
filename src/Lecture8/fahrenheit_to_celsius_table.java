package Lecture8;
import java.util.Scanner;
public class fahrenheit_to_celsius_table {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        temp(S, E, W);
    }

    public static void temp(int S,int E,int W){
        if(S>= 0 && S<=1000){
            if(E>=S && E<=1000){
                if(W>=0 && W<=1000){
                    for(int i=S; i<=E; i=i+W){
                        int C = (i-32)*5/9;
                        System.out.println(i+"\t"+C);
                    }
                }
            }
        }
    }
}
