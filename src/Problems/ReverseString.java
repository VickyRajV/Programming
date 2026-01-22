package Problems;

import java.util.Scanner;

//public class ReverseString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//        String rev ="";
//
//        for(int i=word.length()-1;i>=0;i--){
//            rev = rev+word.charAt(i);
//        }
//        System.out.println(rev);
//        if(word.equals(rev)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("False");
//        }
//    }
//}


//Using the In-Built method using StringBuffer and StringBuilder
public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
