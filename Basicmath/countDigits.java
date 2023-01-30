package Basicmath;
import java.util.*;
import java.util.Scanner;


public class countDigits{

    public  int countdigits(int N){
            int count=0;
            int n=N;
            int b;
            while(N>0){
                b=N%10;
                N= N/10;
                if(b!=0){
                    if(n%b==0){
                        count++;
                    }
                }
            }
            // code here
            return count;
        }

    
public static void main(String[] args){
    countDigits obj =  new countDigits();
    
    System.out.println(obj.countdigits(6234));
    
    // Scanner sc=  new Scanner(System.in);
    // int N;
    // N = sc.nextInt();
    // sc.close();






}
}