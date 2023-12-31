

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int peak=peakOfMountain(arr);
        
        int firsttry=search(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return search(arr, target, peak+1, arr.length-1);
    }
    
    static int peakOfMountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid=start+(end-start)/2;
            
            if (arr[mid]<arr[mid+1]) {
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    
    static int search(int[] arr, int target, int start, int end){
        boolean isAsc=arr[start]< arr[end];
        while(start <= end){
            int mid=start+(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
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
