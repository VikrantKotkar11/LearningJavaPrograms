package ex_11_Practice;

import java.util.Locale;
import java.util.Scanner;

public class lab137_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name= sc.next();
        name=name.toLowerCase();

        String reverse="";
        for(int i=name.length() -1;i>=0;i--){
            reverse = reverse + name.charAt(i);
        }

        if (name.equals(reverse)){
            System.out.println("This name is Palindrome!");
        }else {
            System.out.println("This name is not Palindrome!");
        }

    }
}
