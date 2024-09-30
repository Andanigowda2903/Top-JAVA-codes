// Java Program for finding the largest element of the array
public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[]={21,34,48,56,9,81,61,73};
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
            }
        System.out.println("The largest element is: "+max);
        }

    }


