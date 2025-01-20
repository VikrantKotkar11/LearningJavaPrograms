package ex_03_Operators;

public class lab45_TypeCasting_ex {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
       // float total=course+GST; //--> 118.45.....Implicit(Widenning)
        int total=course+(int)GST;//-->118...here we lost the data/value in case of explicit(Narrow) casting
        System.out.println(total);
    }
}
