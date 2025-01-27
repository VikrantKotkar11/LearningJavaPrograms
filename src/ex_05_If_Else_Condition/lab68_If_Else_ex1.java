package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab68_If_Else_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int no= sc.nextInt();

        if(no==4){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
