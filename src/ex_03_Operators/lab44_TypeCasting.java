package ex_03_Operators;

public class lab44_TypeCasting {
    public static void main(String[] args) {
        long ph_no=9898798765l;
        short s=(short)ph_no; //Explicit casting
        System.out.println(s);

        short a=123;
        long b=a; //  b=(short)a--> optional....   Implicit casting
        System.out.println(b);
    }
}
