package ex_09_Functions;

import java.util.Scanner;

public class lab115_functions_user_defined_3_userinput {
    public static void main(String[] args) {
        // With Parameter without Returntype (with inputs from user)

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = sc.next();
        System.out.println("enter your age :");
        int age = sc.nextInt();
        System.out.println("enter the salary:");
        double salary = sc.nextDouble();
        greet_with_details(name,age,salary);
    }

    static void greet_with_details(String name, int age, double salary){
        System.out.println("Your name is "+name+"\nyour age is "+age+"\nyour salary is "+salary);
    }
}
