package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String st1 = "listen";
        String st2 = "silent";

        char[] ar1 = st1.toCharArray();
        char[] ar2 = st2.toCharArray();
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1,ar2)){
            System.out.println("Its anagram");
        }
        else{
            System.out.println("Not");
        }
    }
}
