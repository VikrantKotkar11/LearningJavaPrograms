package ex_09_Functions;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.SortedMap;

public class lab120_functions_ex1 {
    public static void main(String[] args) {
        // create function of mathematical operations with inputs from user...
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no :");
        int a= sc.nextInt();
        System.out.println("enter second no:");
        int b= sc.nextInt();

        int addition=sum(a,b);
        System.out.println("Addition is "+addition);
        int subtraction=sub(a,b);
        System.out.println("Subtraction is "+subtraction);
        int multiplication=mul(a,b);
        System.out.println("Multiplication is "+multiplication);
        int division=div(a,b);
        System.out.println("Division is "+division);

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        if(b==0){
            System.out.println("Div by zero not allowed");
        }
        return a/b;
    }
}
