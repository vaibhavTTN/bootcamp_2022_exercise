
//Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Enter Text : ");
            String str = sc.nextLine();
            if(str.equals("XDONE")){
                System.out.println("Entered Text : "+str);
                flag = false;
            }
        }while(flag);


    }
}
