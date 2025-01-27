package ex_07_For_loop;

import java.util.Scanner;

public class lab100_for_evenodd {
    public static void main(String[] args) {


        for (int i=0;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even no:"+i);
            }
            else {
                System.out.println("Odd no:"+i);
            }
        }
    }
}
