package ex_09_Functions;

public class lab112_functions_user_defined_1 {
    public static void main(String[] args) {
            //  Without_paramter_Without_Returntype...

        main(); // calling the function...
        greet();    // here no paramter provided....
    }

    static void main(){     //  void = no returntype
        System.out.println("This is main function");
    }

    static void greet(){
        System.out.println("This is greet function");
    }
}
