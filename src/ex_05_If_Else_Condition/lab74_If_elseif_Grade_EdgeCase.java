package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab74_If_elseif_Grade_EdgeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        char grade;

        
        if (marks>=90 && marks<=100){
            grade='A';
        } else if (marks >= 80 && marks<90) {
            grade='B';
        } else if (marks>=70 && marks<80) {
            grade='C';
        } else if (marks>=60 && marks<70) {
            grade='D';
        } else if (marks<0 || marks >100) {
            System.out.println("This is Invalid marks");
            grade='O';
        } else {
            grade='F';
        }
        System.out.println("Your Grade is "+grade);
    }
}
