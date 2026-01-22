package Problems;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,1,2};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length-1 ; i++){
            for(int j = i+1 ; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
