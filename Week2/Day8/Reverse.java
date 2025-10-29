//Write a program to reverse a string.  

import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String input=sc.nextLine();
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        System.out.println("Reversed String: "+reverse);
        sc.close(); 
    }
}
