package Problems.Algorithms;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BinarySearch1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0 ; i<n ; i++){
//            System.out.println("Enter the "+ i + " Element:" );
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println("Enter the target element : ");
//        int target = sc.nextInt();
//        int left =  0, right = arr.length-1;
//        int index = -1;
//
//        while(left <= right){
//            int mid = left + (right-left)/2;
//            if(arr[mid] == target){
//                index = mid;
//                break;
//            }
//            else if(arr[mid] < target){
//                left = mid+1;
//            }
//            else if(arr[mid] > target){
//                right = mid -1;
//            }
//        }
//            if(index != -1){
//                System.out.println("Element found at "+ index);
//            }
//            else {
//                System.out.println("No element found");
//            }
//
//    }
//}

import java.io.*;

// Marking the class with Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class BinarySearch1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vicky");

        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Serialize object
            oos.writeObject(s1);

            oos.close();
            fos.close();
            System.out.println("Object saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

