package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr1 = {12,43,18,19,22};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value 1 and value 2");
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int[] arr =new int[arr1.length+2];
        arr[arr.length-2]=v1;
        arr[arr.length-1]=v2;

        for(int i=0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int length = arr.length-1;
        int bigInteger = arr[length];
        int secondBig = -1;
        for(int i=arr.length-2;i>=0;i--) {
            if (arr[i] != bigInteger) {
                secondBig = arr[i];
                break;
            }
        }
        if(secondBig!=-1){
            System.out.println(secondBig);
        }
        else{
            System.out.println("All elements are same");
        }

    }
}
