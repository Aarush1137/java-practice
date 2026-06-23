package day02_arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int temp=arr[0];
        int max = temp;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > temp){
                max = arr[i];
                temp = arr[i];
            }
        }
        System.out.println("max num in the array is "+max);
    }
}
