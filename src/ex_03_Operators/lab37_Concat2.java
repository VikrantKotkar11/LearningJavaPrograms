package ex_03_Operators;

public class lab37_Concat2 {
    public static void main(String[] args) {
        String name1="Vikrant";
        String name2="Kotkar";
        int a=10;
        int b=20;
        System.out.println(name1+name2+a+b);
        //All are acting like "String", as it's started with String-data_type

        System.out.println(a+b+name1+name2);
        //Here, first operation acting like maths, as it's started with int-data_type

        //Maths also happend in first case, So Brackets"()" needs to be used...
        System.out.println(name1+name2+(a+b));
    }
}
