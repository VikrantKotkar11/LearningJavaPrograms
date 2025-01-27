package ex_06_Switch_Case;

public class lab85_Switch_Break {
    public static void main(String[] args) {
        int itemcode=5;

        switch (itemcode){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("Default");
        }
    }
}
