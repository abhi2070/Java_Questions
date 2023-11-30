package KKPracticeSet.Searching;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={18,12,7,3,14,28};
        System.out.println(linearSearch(arr));
    }
    static int linearSearch(int[] arr){
        if (arr.length==0) {
            return -1;
        }
        
        int greater=arr[0];
        for (int i=0; i<arr.length; i++) {
            int element=arr[i];
            if (element<greater) {
                greater=element;
            }
        }
        return greater;
    }
}
