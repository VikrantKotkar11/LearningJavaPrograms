package ex_06_Switch_Case;

import java.util.Scanner;

public class lab82_Switch_browser {
    public static void main(String[] args) {
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser:");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting the Chrome...");
                break;
            case "firefox":
                System.out.println("Starting the Firefox...");
                break;
            case "edge":
                System.out.println("Starting the Edge...");
                break;
            default:
                System.out.println("Invalid browser!");
                break;
        }
    }
}
