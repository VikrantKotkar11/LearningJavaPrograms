package ex_10_String;

public class lab125_string_ex1 {
    public static void main(String[] args) {
        String s1="hello";
        s1="world";
        //System.out.println(s1); --> world


        String a1="hello";
        a1.concat("World");
        //System.out.println(a1); --> hello

        String a2=a1.concat("world");
        System.out.println(a2);
    }
}
