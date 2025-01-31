package ex_07_For_loop;

public class lab095_for_ifelse {
    public static void main(String[] args) {
        for(int age=1;age<18;age++) {
            System.out.println("Age:"+age);
            if (age >= 15) {
                System.out.println("Gift from Santa...");
            } else {
                System.out.println("No gift from Santa...");
            }
        }
    }
}
