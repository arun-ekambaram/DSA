package Basicmath;
import java.util.*;
import java.util.Scanner;
import java.lang.Long;


public class LcmAndGcd{
    public static void  lcmgcd( Long A, Long B){
        int lcm;
        int gcd;
        int arr[] = {};
        int N = arr.length;
        int newArr[] = new int[n];    
        int n = 2^32;
        
        //gcd
        // for(int i=1; i<=A;i++){
        //     if(A%i==0){
        //         System.out.println(i);
        //     }
        //     else{
        //         System.out.println("djv");
        //     }
    
     
        // }
        //gcd
        for(int j=1;j<=n;j++){
            if(B%j==0 && A%j==0){
                int i;
                System.out.println(j);
                int newArr[] = new int[j];
            }
    
            
        }
        for(int i = 0; i<N; i++) {  
            newArr[i] = arr[i];  
            }  

    
    }   


    

        
    public static void main(String[] args){
        long a=16;
        long b=10;

        LcmAndGcd obj =  new LcmAndGcd();
        
        
        
        
        
        obj.lcmgcd(a,b);
        
    
    
    }
}
