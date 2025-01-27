package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab72_If_ElseIf_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second No:");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Greater no :"+num1);
        } else if (num1<num2) {
            System.out.println("Greater no :"+num2);
        }else {
            System.out.println("Both numbers are equal!");
        }
    }
}
