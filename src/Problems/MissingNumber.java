package Problems;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6};
        int n = 10;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int num : nums){
            actualSum = actualSum+num;
        }
        System.out.println("The missing Number is "+ (expectedSum-actualSum));
    }
}

