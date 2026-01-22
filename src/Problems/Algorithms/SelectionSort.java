package Problems.Algorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(2,100);
        }
        System.out.println("Before Sorting ");
        System.out.println( Arrays.toString(numbers));

        for(int i=0;i< numbers.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]<numbers[minIndex]){
                    minIndex=j;
                }
            }
                int temp = numbers[minIndex];
                 numbers[minIndex] = numbers[i];
                 numbers[i] = temp;
        }
        System.out.println("Sorted Array");
        for(int num : numbers){
            System.out.print(num+ " ");
        }
    }
}
