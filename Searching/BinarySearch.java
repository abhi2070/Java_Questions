public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22,45,89};
        System.out.println(binary(arr,18));
    }
    static int binary(int[] arr, int target){
        if (arr.length==0) {
            return -1;
        }
        
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if (target < arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
            
        }
    return -1;
    }
}
