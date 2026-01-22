import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollecionOfWords {
    public static void main(String[] args) {
        String text = "apple banana apple orange hii hello mango banana";
        Map<String, Integer> frequMap = new HashMap<>();
        for(String word : text.toLowerCase().split(" ")){
            frequMap.put(word, frequMap.getOrDefault(word, 0)+1 );
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(frequMap.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top two repeated words are : ");
        for(int i=0; i<Math.min(2,list.size()); i++){
            Map.Entry<String, Integer> e = list.get(i);

        }
    }
}


class a{
    public static void main(String[] args) {
        String a = "vicky";
        String b = "vicky";
        String c = "VICKY".toLowerCase();
        int d = 10;

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}
