package ex_10_String;

public class lab128_string_comparision {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";

        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("Hello");

        //Same location referances...
        System.out.println(s1==s2);

        //Different location...
        System.out.println(s3==s4);
        System.out.println(s1==s3);
    }
}
