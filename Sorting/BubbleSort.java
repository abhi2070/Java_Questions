package KKPracticeSet.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swap;
        
        for (int i=0; i<arr.length; i++) {
            swap=false;
            for (int j=1; j<arr.length-1; j++) {
                if (arr[j]<arr[j-1]) {
                    //swaping
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
