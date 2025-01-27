package ex_05_If_Else_Condition;

import java.util.Scanner;

public class lab75_Triangle {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is "equilateral" (all sides are equal),
        // "isosceles" (exactly two sides are equal),
        // or "scalene" (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side2 → eq, iso, scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of side1 :");
        int side1 = sc.nextInt();
        System.out.println("enter length of side2 :");
        int side2 = sc.nextInt();
        System.out.println("enter length of side2 :");
        int side3 = sc.nextInt();

        if (side1<=0 || side2<=0 || side3<=0) {
            System.out.println("Invalid side, side length must be positive");
        }
        else if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("This is Equilateral triangle !");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("This is Isosceles Triangle");
        }  else {
            System.out.println("This is Scalene triangle");
        }
    }
}
