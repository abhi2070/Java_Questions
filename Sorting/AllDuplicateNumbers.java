package KKPracticeSet.Sorting;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,3,2};
        System.out.println(cyclicSort(arr));
    }
    static List<Integer> cyclicSort(int[] arr){
        List<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if (arr[i] != i+1) {
                int correctIndex=arr[i]-1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }else{
                    ans.add(arr[i]);
                    i++;
                }
            }else{
                i++;
            }
        }
        
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
