package ex_06_Switch_Case;

public class lab86_Switch_ex2 {
    public static void main(String[] args) {
        int a=10;       // No relationship with "a".
        switch(-1){
            default:
                System.out.println("default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
