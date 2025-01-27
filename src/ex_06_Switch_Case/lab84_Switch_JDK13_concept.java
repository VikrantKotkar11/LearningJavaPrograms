package ex_06_Switch_Case;

import java.util.Scanner;

public class lab84_Switch_JDK13_concept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the itemcode :");
        int itemcode=sc.nextInt();

        //it's supports on jdk>13, multiple case...
        switch (itemcode){
            case 001,003,005:
                System.out.println("All are electronic Gadget");
                break;
            case 002,004,006:
                System.out.println("All the Mech Gadget");
                break;
            default:
                System.out.println("Invalid itemcode");
                break;
        }
    }
}
