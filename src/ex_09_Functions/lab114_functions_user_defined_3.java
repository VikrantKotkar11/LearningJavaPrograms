package ex_09_Functions;

public class lab114_functions_user_defined_3 {
    public static void main(String[] args) {
            // With Parameter without Returntype (90% using this function)

        greet_with_name("Vikrant");
        greet_with_name("Kotkar");

        greet_with_fullname("Vikrant"," Kotkar");
    }

    static void greet_with_name(String name){
        System.out.println("Your name is "+name);
    }
    static void greet_with_fullname(String first_name, String last_name){
        System.out.println("Your full name is "+first_name+last_name);
    }
}
