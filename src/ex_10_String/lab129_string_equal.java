package ex_10_String;

public class lab129_string_equal {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";

        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");

        // use equal string function

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        // not equal

        System.out.println(s3.equals(s5));

        // IgnoreCase....

        System.out.println(s3.equalsIgnoreCase(s5));

    }
}
