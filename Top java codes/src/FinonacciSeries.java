import java.util.*;
public class FinonacciSeries {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3 ;
        int start=3;
        int end=999;
        System.out.print(n1+" "+n2+" ");
            for (int i = 3; i <= 15; i++) {
                // i < 15: Fixed number of Fibonacci numbers, which may be greater than 15.
                // n2 < 15: Variable number of Fibonacci numbers based on their value, ensuring all printed numbers are less than 15.
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" " + n3);
            }
        }


    }
