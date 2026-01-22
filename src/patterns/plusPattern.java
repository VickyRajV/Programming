package patterns;

import java.util.Scanner;

public class plusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = 5; // size should be odd for a symmetric plus

                for (int i = 0; i < n; i++) { // rows
                    for (int j = 0; j < n; j++) { // columns
                        if (i == n / 2 || j == n / 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(); // new line
                }
            }
        }


