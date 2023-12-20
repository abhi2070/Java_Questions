public class SecondSmallestNum {
    public static void main(String[] args) {
        int[] arr={5,6,3,2,9,1,123};
        
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        
        for (int i=0; i<arr.length; i++) {
            if (smallest>arr[i]) {
                ssmallest=smallest;
                smallest=arr[i];
            }else if (arr[i]>smallest && arr[i]<ssmallest) {
                ssmallest=arr[i];
            }
        }
        System.out.println(ssmallest);
        
    }
    
}
