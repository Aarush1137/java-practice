package day02_arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int temp=arr[0];
        int min = temp;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < temp){
                min = arr[i];
                temp = arr[i];
            }
        }
        System.out.println("min num in the array is "+min);
    }
}
