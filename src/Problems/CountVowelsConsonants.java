package Problems;
import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello";
        int vowels = 0;
        int consonant = 0;
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z' ){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("vowels "+ vowels );
        System.out.println("Consonants "+ consonant);
    }
}


















//package Problems;
//
//import java.util.Scanner;
//
//public class CountVowelsConsonants {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//        word.toLowerCase();
//        int vowel=0,consonent=0;
//
//        for(char ch: word.toCharArray()){
//            if("aeiou".indexOf(ch) != -1){
//                vowel++;
//            }
//            else{
//                consonent++;
//            }
//        }
//
//        System.out.println(vowel);
//        System.out.println(consonent);
//
//    }
//}
