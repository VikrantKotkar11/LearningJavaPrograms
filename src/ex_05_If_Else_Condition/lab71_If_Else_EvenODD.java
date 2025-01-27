package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab71_If_Else_EvenODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No:");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("This is Event Number !");
        }
        else {
            System.out.println("This id Odd Number !");
        }
        // Step 4 :  edge cases
        // large int, -ve handle, zero, other input - G
    }
}
