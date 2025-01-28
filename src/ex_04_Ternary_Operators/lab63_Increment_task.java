package ex_04_Ternary_Operators;

public class lab63_Increment_task {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);

        System.out.println(a);

        // 11+11+12 = --> 34
        //--> 13

        int  i = 20;

        System.out.println(--i + i++ + i--);
        System.out.println(i);

        //19+19+20 --> 58
        //-->19
    }
}
