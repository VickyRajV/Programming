package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        StringBuilder reversedWord = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            reversedWord = reversedWord.append(words[i]).append(" ");
        }
        System.out.println(reversedWord);
    }
}
