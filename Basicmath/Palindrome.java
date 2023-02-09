package Basicmath;
import java.util.*;
import java.util.Scanner;


public class Palindrome{
    public static String Palin(int n){
        int rev=0;
        int ld;
        int N=n;


        while(n>0){
            ld = n%10;
            n = n/10;
            rev = rev*10+ld;
        }
      
        if(rev==N){
            return "Yes";
        }
        else{
            return "No";
        }
       

    }




public static void main(String[] args){
    countDigits obj =  new countDigits();
    
    System.out.println( Palin(121));
    
    // Scanner sc=  new Scanner(System.in);
    // int N;
    // N = sc.nextInt();
    // sc.close();
    

}
}