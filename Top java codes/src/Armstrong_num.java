import java.util.Scanner;
import  java.util.*;
    public class Armstrong_num {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int temp;
            int digits = 0;
            int sum = 0;
            int start=1;
            int end=999;
            temp = num;
            while(temp>0){
                temp=temp/10;
                digits++;
            }
                temp=num;

                while (temp>0){
                    int last=temp%10;
                    sum+=Math.pow(last, digits);
                    temp=temp/10;

                }
                if (num==sum){
                    System.out.println("It is a Armstrong Number: "+num);
                }
                else {
                    System.out.println("It is not an Armstrong Number: "+num);
                }
            }
        }
