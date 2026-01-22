package Problems;

import java.util.Scanner;

public class ArrayOperations {

    // Method to create and return an array
    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr; // returning array
    }

    // Method to print the array
    public static void printArray(int[] array) {
        System.out.println("Array elements are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // for new line
    }

//    public static void main(String[] args) {
//        Problems.ArrayOperations ArrayOperation = new Problems.ArrayOperations();
//        int[] arr = ArrayOperation.getArray();
//        ArrayOperation.printArray(arr);
//    }
}

// wap to revers an array
//wajp to merge two arrys into a single array
//wajp to merge two arrys in zig-zag manner