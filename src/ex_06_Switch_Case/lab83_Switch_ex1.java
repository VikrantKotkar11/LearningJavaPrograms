package ex_06_Switch_Case;

public class lab83_Switch_ex1 {
    public static void main(String[] args) {

        int a=10;
        switch (a){     // This is valid syntax, INT can be passed in switch.
        }

        char ch='A';    //65--> char is valid  case bcoz it converts into the int...ASCII char==Int
        switch (ch){
            case 65:
                System.out.println("A");
        }

        //Boolean is not valid
        //boolean b=true;
        //switch (b){
        //}

        //long is also converted into the int --> valid
        long a1=30l;
        switch ((int)a1){
            case(30):
                    System.out.println(a1);
        }


    }
}
