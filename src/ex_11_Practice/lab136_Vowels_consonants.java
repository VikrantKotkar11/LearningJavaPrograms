package ex_11_Practice;

import java.util.Locale;
import java.util.Scanner;

public class lab136_Vowels_consonants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");  // inputs from user
        String name=sc.next();
        int v=0, c=0;
        name=name.toLowerCase();    // convert into the lowercase

        for(int i=0; i< name.length(); i++){
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
        }else {
                c++;
            }
        }
        System.out.println("Vowels : "+v);
        System.out.println("Consonants : "+c);
    }
}
