
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        if(n<0 || n>100){
            System.out.println("Invalid Input");
            return ;
        }else{
            int ans=fact(n);
            System.out.println("Answer: "+ans);
        }
    }
    public  static int fact(int n){
        if (n==1){
            return 1;
        }
        return n* fact(n-1);
    }


}

