package KKPracticeSet.Searching;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        if (arr.length==0) {
            return -1;
        }
        
        int start=0;
        int end=arr.length-1;
        
        while(start <= end){
            int mid=start+(end-start)/2;
            if (target > arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return arr[end%arr.length];
    
    }
}
