package ex_02_Java_Basic;

public class lab022_Constants_final1 {
    public static void main(String[] args) {
        final int a=10;
        final String abc="AIA";
        final double D1=999.99;

        final int age;
        age=11;//must be assign the value in final_variable
        //age=22; --> can't be update the value of final_variable

        System.out.println(age);
    }
}
