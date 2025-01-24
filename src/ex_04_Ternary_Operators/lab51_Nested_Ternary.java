package ex_04_Ternary_Operators;

public class lab51_Nested_Ternary {
    public static void main(String[] args) {
        int num=15;
        String result =  (num>10) ? (num>20 ? "Greater than 20" : "Betn 10 to 20") : "Less than 10";
        System.out.println(result);
    }
}
