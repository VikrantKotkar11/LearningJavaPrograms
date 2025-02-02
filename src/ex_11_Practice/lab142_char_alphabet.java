package ex_11_Practice;

import java.util.Scanner;

public class lab142_char_alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);

        if((ch >='a'&& ch<='z')||(ch >='A' && ch <='Z'))
        {
            System.out.println(ch+" is a Alphabet");
        }
        else {
            System.out.println(ch+" is not a Alphabet");
        }
    }
}
