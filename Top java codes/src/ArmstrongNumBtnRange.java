import java.util.Scanner;
import  java.util.*;
public class ArmstrongNumBtnRange {
    public static void main(String[] args) {
        int start=1;
        int end =999;
        for (int i=start;i<=end;i++){
            int temp=i;
            int digits=0;
            int sum=0;
            while (temp>0){
                temp=temp/10;
                digits++;
            }
            temp =i;

            while(temp>0){
                int last=temp%10;
                sum+=Math.pow(last,digits);
                temp=temp/10;

            }
            if (i==sum){
                System.out.println(i);
            }



        }
    }
}
