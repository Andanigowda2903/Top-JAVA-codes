//Check if a Number is Positive or Negative in Java

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        int num = 5;

        //Conditions to check if the number is negative or positive
        if (num > 0)
            System.out.println ("The number is positive: "+num);
        else if (num < 0)
            System.out.println ("The number is negative :"+num);
        else
            System.out.println ("Zero :"+ num);
    }
}
