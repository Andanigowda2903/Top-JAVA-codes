import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// program to covert the currencies
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double amount=sc.nextDouble();
        sc.close();

        NumberFormat n1=NumberFormat.getCurrencyInstance(   Locale.US);
        String US=n1.format(amount);

        NumberFormat n2= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
         String India=n2.format(amount);

         NumberFormat n3=NumberFormat.getCurrencyInstance(Locale.CHINA);
         String China= n3.format(amount);

        NumberFormat n4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String France= n4.format(amount);

        System.out.println("US: "+US);
        System.out.println("India: "+India);
        System.out.println("China: "+China);
        System.out.println("France: "+France);





    }
}
