//Write a program to calculate the area of a rectangle using variables.  
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();
        
        if (length <= 0) {
            System.out.println(" Length can't be zero or negative!");
            return;
        }
    

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();
        
        if (breadth <= 0) {
            System.out.println("Breadth can't be zero or negative!");
            return;
        }

        if (length == breadth) {
            System.out.println(" Since length and breadth are equal, it's a square.");
        }

        double area = length * breadth;
        

        System.out.println("Area of Rectangle: " + area);
       

        sc.close();
    }
}
