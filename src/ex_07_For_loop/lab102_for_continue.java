package ex_07_For_loop;

public class lab102_for_continue {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            if(i==5){
                continue;//skip the below code & goto the top...
            }
            System.out.println(i);
        }
    }
}
