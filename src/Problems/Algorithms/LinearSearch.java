package Problems.Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40,60,50};
        int target  = 50;
        int index = -1;

        for(int i=0; i<arr.length; i++){
           if( arr[i] == target){
               index = i;
               break;
           }
        }
        if(index!=-1){
            System.out.println(index);
        }
        else{
            System.out.println("Element not found!!!!!!!");
        }
    }
}
