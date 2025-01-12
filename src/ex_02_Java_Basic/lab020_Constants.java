package ex_02_Java_Basic;

public class lab020_Constants {
    public static void main(String[] args) {
        final int a=10;
        //a=20;  --> We can't modify the value of Constants (when "final" is added before data_type)
        System.out.println(a);
    }
}
