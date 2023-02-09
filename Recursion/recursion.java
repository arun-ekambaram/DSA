package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class recursion {
    public  void fn(int N){
        if(N==11){
            return;
        }

        System.out.println(N);
        N++;
        fn(N);

    }
    int i=1;

    void printGfg(int N) {
        
        if(i<=N+1){
            return;
        }
        System.out.print("GFG"+" ");
        i++;
        printGfg(N);

    }
    int k=0;
    void printNos(int N) {
        
        if(N<=k){
            return;
        }
        System.out.print(N +" ");
        N--;
        printNos(N);
        
        // code here
    }

    long sum=0;

    long sumOfSeries(long N) {
        for(long c=1;c<=N;c++){
        long cube= (c*c*c);
        sum=sum+cube;
        }
        System.out.println(sum+" ");
        return sum;
  
       
        
        // code here
    }

    static ArrayList<Long> factorialNumbers(long N){
    
        ArrayList<Long> arrayList = new ArrayList<Long>();
        long fact=1;
        for(long i=1;i<=N;i++){
            fact= fact*i;
        
            if(fact<=N){
                arrayList.add(fact);
                    
            }
         
        }
        System.out.println(arrayList);
        // code here
        return arrayList;
    }

    static void  reversearray(int arr[], int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

        for(int i=n-1; i>=0 ;i--){
            arr[i]= arr[n-1-i];

        }
    
    }
    
    // int isPalindrome(String S) {
    //     S= S.toLowerCase();
    //     String rev=" ";

        
    //     for(int i=S.length()-1; i>=0;i--){
    //         rev = rev + S.charAt(i);
    //     }

    //     if(S.equals(rev)){
          
    //         System.out.println(1);

    //     }
    //     return 1;

    //         }


        public  int f(int n) 
            {
                if( n <=1){
                    return n;
                }else{

                    int last = f(n-1);
                    int slast = f(n-2);
                    return last + slast;
                }
            }
        
        public boolean f(int i, String s ){

            if(i >=s.length()/2){
                return true;
            }
            if( s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
    
        
        return f(i+1,s);
}

        public boolean isPalindrome(String s){
            String res="";

            for(int i=0;i< s.length();i++){
        
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ){
                res += Character.toLowerCase(s.charAt(i));
            }

            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                res += s.charAt(i);
            }
            
            else if(s.charAt(i) >= '0' &&s.charAt(i) <= '9'){
                res += s.charAt(i);
            }


        }
        String ans2 ="";
        for(int i=0; i< res.length();i++){
            ans2 += res.charAt(i);
        }

            if(res.equals(ans2)){
                return true;
            }
    
        return false;
        }    

        public boolean isPalindrome(String s) {

            String ans = "";
    
            for(int i =0; i < s.length();i++){
    
                //Check if charAt(i) is between 'A' to 'Z' then convert it to lower case and add it to ans
    
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    ans += Character.toLowerCase(s.charAt(i));
                }
    
                //Check if charAt(i) is between 'a' to 'z' then add it to ans
    
                else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                    ans += s.charAt(i);
                }
    
                 //Check if charAt(i) is between '1' to '9' then add it to ans
    
                else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    ans += s.charAt(i);
                }
            }
    
            //Now Reverse the ans string 
    
            String ans2 = "";
    
            for(int i = 0; i < ans.length();i++){
    
                ans2 = ans.charAt(i) + ans2;
            }
    
            //after reversing check if ans is equal to ans2 then it is a palindrome string
    
            if(ans.equals(ans2)){
                return true;
            }
            return false;
        }
    

        
        


    
    

                
                //Your code here
           






    



    public static void main(String[] args){
        recursion obj =  new recursion();
        // obj.fn(1);
        // obj.printNos(10);
        // obj.sumOfSeries(3);
        // obj.factorialNumbers(3);
    //     int n = 5;
    //   int arr[] = { 5, 4, 3, 2, 1};
    //     reversearray(arr, n);
    // obj.isPalindrome("121");
    // System.out.print((obj.f(4)));

    // System.out.print((obj.f(0,"mom")));
      
    System.out.println(obj.isPalindrome("ffadam"));

       
        
        
    }

    
}
