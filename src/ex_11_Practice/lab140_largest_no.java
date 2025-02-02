package ex_11_Practice;

import java.util.Scanner;

public class lab140_largest_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();

        // using if-else...
        if(a>b && a>c){
            System.out.println("This is greater no : "+a);
        } else if (b>c) {
            System.out.println("This is greater no : "+b);
        }else {
            System.out.println("This is greater no : "+c);
        }

        // nested operator
        int largest= (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
        System.out.println("The largest no is "+largest);
    }
}
