package ex_03_Operators;

public class lab42_Revision {
    public static void main(String[] args) {
        boolean b1=true;//  Assignment operator
        int a=10;
        int b=20;
        System.out.println(a+b);//  Arithmatic operator --> +,-,%,/,*
        System.out.println(a>b);//  Relational operator -->  >,>=,<,<=,==,!=
        System.out.println(true||false); //Logical operator -->  OR or AND, ||, &&, !
        System.out.println(++a);//Increment and Decrement operator --> ++, --


        //compound Assignment operator --> +=, -+, *=, /=,
        int age=10, age1=20;
        age += 10;      // age=age+10;
        age1 -= 10;      // age1=age1-10;
        System.out.println(age);
        System.out.println(age1);

    }
}
