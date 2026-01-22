package Problems;

public class ArrayEvenOddCount {

    public static int[] getEvenOddCount(int[] arr){
        int[] count = {0,0};
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]%2 == 0){
                count[0]++;
            }
            else{
                count[1]++;
            }
        }
        return  count;
    }
}


//define a method to return the count of the prime numbers present in an array
        //define a method to return the second biggest number in an array
//define a method to replaces every element in an array by their number of sum of their digits
// define a method to return the difference b/w biggest and smallest element in an array