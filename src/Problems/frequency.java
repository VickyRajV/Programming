package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class frequency {
    public static void frequency(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0 ;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            System.out.println(key+" -> "+ map.get(key));
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayOperations.getArray();
        frequency(arr);


    }
}
