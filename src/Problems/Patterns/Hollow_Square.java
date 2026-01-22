package Problems.Patterns;

public class Hollow_Square {
    public static void main(String[] args) {
        int num = 5;
        for(int i=0; i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0 || i==num-1 || j==0 || j == num-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
