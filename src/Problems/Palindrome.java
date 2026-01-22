package Problems;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        if(isPalindrome(name)){
            System.out.println("Its a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
    }
}
