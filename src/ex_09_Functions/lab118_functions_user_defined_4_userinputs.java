package ex_09_Functions;

import java.util.Scanner;

public class lab118_functions_user_defined_4_userinputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int a= sc.nextInt();
        System.out.println("Enter no:");
        int b= sc.nextInt();
        int sum=sum_of_two_numbers(a,b);
        System.out.println(sum);
    }

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
}
