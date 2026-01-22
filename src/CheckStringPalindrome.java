import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

       word = word.toLowerCase();
        int left = 0 , right  = word.length()-1;
        boolean isPalindrome = true;

        while (left < right) {

            if(word.charAt(left) != word.charAt(right)){
                isPalindrome = false;
                break;

            }
            left++;
            right--;

        }
        if(isPalindrome){
            System.out.println("String is a Palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }
}
