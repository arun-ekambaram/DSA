package Basicmath;
import java.util.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static String armstrong(int n){
        int ld;
        int N=n;
        int sum=0;
        if(n>=100 && n<1000){
            while(n>0){
                ld = n%10;
            sum=sum+(ld*ld*ld) ;
            n=n/10;
            }
        }
            if(sum==N){
                return "Yes";
            }
            else{
                return "No";
            }
        
    
    }

 
    
    
    public static void main(String[] args){
        ArmstrongNumber obj =  new ArmstrongNumber();
        
    System.out.print((obj.armstrong(153)));
   
        
        
    }
    
    
}
