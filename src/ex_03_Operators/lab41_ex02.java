package ex_03_Operators;

public class lab41_ex02 {
    public static void main(String[] args) {
        int age=12;
                boolean b=!(age>10 || age < 5);
                //      = !(T || F) == !(T) == (F) == false

        System.out.println(b);
    }
}
