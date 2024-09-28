// Palindrome Program in Java by taking user input
import java.util.Scanner;
public class Palindrome_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rem;
        int reverse=0;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if (temp==reverse){
            System.out.println("The given number is palindrome: "+reverse);
        }
        else {
            System.out.println("The given number is not a palindrome : "+reverse);
        }

        }

    }
