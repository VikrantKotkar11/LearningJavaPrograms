package ex_02_Java_Basic;

public class lab027_Literals_Char {
    public static void main(String[] args) {
        //Char...
        char c1='A';
        char c2='@';
        char c3='8';
        char c4=' '; //blank space...

        System.out.println(c3);

        //Escape char...
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char car_r='\r';//delete previous word... # car_r or carriage_return

        System.out.println("Vikrant"+ new_line+"Kotkar");
        System.out.println("Vikrant"+ tab_line+"Kotkar");
        System.out.println("Vikrant"+ back_space+"Kotkar");
        System.out.println("Vikrant"+ car_r+"Kotkar");


    }
}
