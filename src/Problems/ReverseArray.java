package Problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5};
        int[] reverse = new int[arr.length];
        for(int i=0; i< arr.length;i++){
            reverse[i] = arr[arr.length-1-i];

        }

        for(int num : reverse){
            System.out.print(num+ " ");
        }
    }

}
