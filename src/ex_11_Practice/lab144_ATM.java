package ex_11_Practice;

import java.util.Scanner;

public class lab144_ATM {
    public static void main(String[] args) {
        //1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
        //2️⃣ Take user input for the amount they want to withdraw.
        //3️⃣ Check withdrawal conditions:
        //
        //The amount should be greater than zero.
        //
        //The amount should be a multiple of 100 (common ATM rule).
        //
        //The amount should not exceed the account balance.
        //4️⃣ Deduct the amount from the balance if conditions are met.
        //5️⃣ Display the updated balance or an error message if the withdrawal fails.

        System.out.println("Welcome to the ATM, your Account Balance is 10,000.");
        int balance=10000;

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Amount to withdraw (multiple of 100):");
        int withdraw_amount=sc.nextInt();

        if(withdraw_amount>0 && withdraw_amount%100==0 && withdraw_amount<=10000){
            System.out.println(withdraw_amount+" is withdraw from your amount, please collect !");
            balance=balance-withdraw_amount;
            System.out.println(balance+" is your current Account Balance.");
        }else {
            System.out.println("Withdraw failed! please enter the valid withdraw amount.");
        }


    }
}
