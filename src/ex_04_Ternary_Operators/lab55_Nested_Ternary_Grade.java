package ex_04_Ternary_Operators;
public class lab55_Nested_Ternary_Grade {
    public static void main(String[] args) {
        int m=71;
        String Result = m>=90 ? "A" : ((m>=80 && m<90) ? "B" : (m>=70 && m<80) ? "C" : (m>=60 && m<70) ? "D" : "Fail");
        System.out.println(Result);
    }
}
