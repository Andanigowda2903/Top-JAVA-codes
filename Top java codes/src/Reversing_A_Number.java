//Reverse a given number in Java

public class Reversing_A_Number {
    public static void main(String[] args) {
        int num=12021;
        int rem;
        int reverse=0;
        System.out.println("the number before reversing:  "+num);
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;

        }
        System.out.println("the number after reversing:  "+reverse);
    }
}
