package Basicmath;
import java.util.*;
import java.util.Scanner;

public class sumofdivisor {
    public static int sumofd(int N){

        int sum=0;
 
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(N%j==0){
                sum=sum+j;
                N++;
            }
        }
     
    }
    return sum;
}


    static void main(String[] args){
    sumofdivisor obj =  new sumofdivisor();
    
    System.out.print((obj.sumofd(4)));
    
    
    
  


}
}