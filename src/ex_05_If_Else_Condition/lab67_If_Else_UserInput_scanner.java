package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab67_If_Else_UserInput_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age !");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are allowed to Vote !");
        }
        else {
            System.out.println("You are not allowed to Vote !");
        }
    }
}
