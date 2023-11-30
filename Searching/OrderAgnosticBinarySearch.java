package KKPracticeSet.Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(binarySearch(arr,4));
    }
    static int binarySearch(int[] arr, int target){
        if (arr.length==0) {
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        
        boolean isAsc =  arr[start] < arr[end];
        
        while(start <= end){
            int mid=start+(end-start)/2;
            if (target== arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target<arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if (target<arr[mid]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
}
