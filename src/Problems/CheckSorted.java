package Problems;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};

        for(int i=0; i< arr.length;i++){
            if(arr[i]>arr[i+1]){
                return;
            }
            System.out.println("Not sorted");
        }
        System.out.println("Sorted");
    }
}
