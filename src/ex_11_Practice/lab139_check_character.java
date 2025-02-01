package ex_11_Practice;

import java.util.Scanner;

public class lab139_check_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character:");
        char c=sc.next().charAt(0);

        if(c=='i' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("This is vowel.");
        }else {
            System.out.println("this is consonent.");
        }

    }
}
