package ex_09_Functions;

public class lab113_functions_user_defined_2 {
    public static void main(String[] args) {
        //      Without Parameter with returntype

        String s=greet_with_name();
        System.out.println(s);
        int age=age_to_vote();
        System.out.println("Age to vote is "+age);

    }
    static String greet_with_name() {
        return "This is Without Parameter with returntype";
    }
        static int age_to_vote(){
         return 18;
        }

}
