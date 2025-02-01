package ex_09_Functions;

public class lab117_functions_user_defined_4 {
    public static void main(String[] args) {
        // With Parameter and with Return_Type

        int sum=sum_of_two_numbers(3,4);
        System.out.println(sum);
    }
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }
}
