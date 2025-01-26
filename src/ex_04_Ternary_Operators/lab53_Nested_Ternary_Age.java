package ex_04_Ternary_Operators;

public class lab53_Nested_Ternary_Age {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);//....for passing the Input value
        // Adult>18, Minor<18, Senior>65
        String Result = age<18 ? "Minor" : (age>65?"Senior":"Adult");
        System.out.println(Result);
    }
}
