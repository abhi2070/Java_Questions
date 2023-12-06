import java.util.Arrays;
public class CyclicShort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int maxEle, int lastIndex){
        int temp=arr[maxEle];
        arr[maxEle]=arr[lastIndex];
        arr[lastIndex]=temp;
    }
}
