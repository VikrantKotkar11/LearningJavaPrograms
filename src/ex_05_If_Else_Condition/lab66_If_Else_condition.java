package ex_05_If_Else_Condition;

public class lab66_If_Else_condition {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);//...input from user

        if(age>=18){
            System.out.println("You are allowed to Vote!");
        }
        else {
            System.out.println("You are not allowed to vote!");
        }
    }
}
