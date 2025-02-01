package ex_11_Practice;

import java.util.Scanner;

public class lab138_check_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int num= sc.nextInt();

        if(num>=0){
            System.out.println("This is positive no :"+num);
        }else {
            System.out.println("This is negative no :"+num);
        }
    }
}
