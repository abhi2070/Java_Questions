package KKPracticeSet.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num={12,9,45,23,13,90,88,77,16,2};
        int target=77;
        System.out.println(linear(num, target));
    }
    static int linear(int[] arr, int target){
        if (arr.length==0) {
            return -1;
        }
        
        for (int i=0; i<arr.length; i++) {
            int element=arr[i];
            if (element==target) {
                return i;
            }
        }
        return -1;
    }
}
