// Java Code for finding the Smallest Element in an Array
public class SmallestElementInArray {
    public static void main(String[] args) {
        int arr[]={39,12,66,98,5,74,87};
        int min=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum element in the arrays is: "+min);
    }
}
