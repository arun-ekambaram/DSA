package Basicmath;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;



// public class ReverseInteger{
//     public static int ReverseInt(int N){
//         int n=N;
//         int r;
//         int rev=0;
//         int store;
//         double c = Math.pow(2,31);

//         while(n>0){
//         if(-c < n && n > c-1){
//                 r = N%10;
//                 rev= rev*10+r;
//                 N=N/10;



//         }
//         else{[]
//             return 0;
//         }
//         }
//         return rev;


//     }
    
    
public class ReverseInteger{
    public static void reverseint(int decimal){

        int n = decimal;
        String conv;
        char rev;
        String s="";
        String result = Long.toBinaryString( decimal & 0xffffffffL | 0x100000000L ).substring(1);
        System.out.println(result);
        
        for(int i=0;i<result.length();i++){
            rev= result.charAt(i);
            s=rev+s;
         
        }
        System.out.println(s);
        try {
            int g = Integer.parseInt(s, 2);
            System.out.println(g);
        } catch (NumberFormatException e) {
            System.out.println("exception");
        
            
        }
        
     
}




public static void main(String[] args){
    ReverseInteger obj =  new ReverseInteger();
    
    obj.reverseint(13);
    
    
    
  


}
}