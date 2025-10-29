//Write a program that prints your name and favorite IDE.  
import java.util.*;
public class Fav {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Favorite IDE:");
        String IDE=sc.nextLine();
        System.out.println("Name: "+name+ " Favorite IDE "+IDE);
        
    }
}
