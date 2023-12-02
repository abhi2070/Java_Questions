package KKPracticeSet.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        int firstLargest=arr[0];
        int secondLargest=-1;
        
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }else if (arr[i]<firstLargest && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        
        System.out.println(secondLargest);
    }
   
}
