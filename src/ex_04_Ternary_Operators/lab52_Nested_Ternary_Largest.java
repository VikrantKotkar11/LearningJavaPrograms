package ex_04_Ternary_Operators;

public class lab52_Nested_Ternary_Largest {
    public static void main(String[] args) {
        int a=110;
        int b=210;
        int c=220;
        //String large = a>=b ? "A is largest" : (b>=c ? "B is largest" : "C is Largest");
        int large = (a>=b) ? ((a>=c)? a:c) : ((b>=c)?b:c);

        System.out.println("Largest number is " +large);
    }
}
