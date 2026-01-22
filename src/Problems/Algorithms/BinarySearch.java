package Problems.Algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the "+ num + " numbers");
        for(int i=0; i<num ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int target = sc.nextInt();

        int left = 0;
        int right = num-1 , index = -1;

        while(left<right){
            int mid = left+right/2;
            if(arr[mid] == target){
                index = mid;
                break;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else if(arr[mid]> target){
                right = mid-1;
            }
        }
        if(index != -1){
            System.out.println(index);
        }
        else {
            System.out.println("No element found");
        }
    }
}
