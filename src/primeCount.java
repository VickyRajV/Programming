import java.util.Scanner;

//define a method to return the count of the prime numbers present in an array
public class primeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int isPrime = 0;

        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+" element");
            arr[i] = sc.nextInt();
        }
        for(int j = 0 ; j< arr.length ; j++){
            if(arr[j]%arr[j] != 0 ){
                isPrime++;
            }
        }
        System.out.println(isPrime);
    }
}
