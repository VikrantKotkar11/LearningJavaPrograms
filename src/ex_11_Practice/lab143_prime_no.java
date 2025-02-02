package ex_11_Practice;

import java.util.Scanner;

public class lab143_prime_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int no=sc.nextInt();
        boolean prime=true;

        if(no<=1){
            prime=false;
        }else {
            for(int i=2;i<=no/2;i++){
                if(no%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println(no+" is a prime no");
        }else {
            System.out.println(no+" is not a prime no");
        }
    }
}
