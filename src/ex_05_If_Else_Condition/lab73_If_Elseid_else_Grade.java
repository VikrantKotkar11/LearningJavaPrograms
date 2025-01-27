package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab73_If_Elseid_else_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        char grade='F';
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        if (marks>=90 && marks<=100){
           grade='A';
        } else if (marks >= 80 && marks<90) {
            grade='B';
        } else if (marks>=70 && marks<80) {
            grade='C';
        } else if (marks>=60 && marks<70) {
            grade='D';
        }else {
            grade='F';
        }
        System.out.println("Your Grade is "+grade);
    }
}
