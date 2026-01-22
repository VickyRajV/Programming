package Problems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int d = num%10;
            sum = d+sum;
            num = num/10;
        }
        System.out.println(sum);
    }
}
