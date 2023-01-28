package Patterns;

import java.util.*;


public class Patterns{

    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void pattern3(int n){
        for(int i=1;i<n ;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println("  ");

        }
    }

    public static void pattern4(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            
            System.out.println(" ");
        }
    }

    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            // for(int j=0; j<=n-i-1;j++){
            //     System.out.print(" ");

            // }
            System.out.println("");
        }
    }

    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*n-1-2*i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
      
    }
    public static void pattern9(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            // for(int j=0; j<=n-i-1;j++){
            //     System.out.print(" ");

            // }
            System.out.println("");
        }

        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*n-1-2*i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
// for even numbers
    void pattern10(int n) {
        for(int i=0;i<n;i++){
           //space
           for(int j=0; j<n-i-1;j++){
               System.out.print(" ");
           }
           //star
           for(int j=0; j<i+1;j++){
               System.out.print("* ");
           }
           //space
           // for(int j=0; j<=n-i-1;j++){
           //     System.out.print(" ");

           // }
           System.out.println("");
       }

       for(int i=0;i<n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(" ");
           }

           for(int j=0;j<(n-i);j++){
               System.out.print("* ");
           }
           System.out.println("");
       }
       
   }
   
    public static void pattern11(int n){
        for(int i=0;i<n;i++){

            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
        }
        System.out.println(" ");
    }
    for(int i=0;i<n;i++){

        for(int j=1;j<=n-i-1;j++){
            System.out.print("* ");
    }
    System.out.println(" ");
}
    }

    public static void pattern12(int n){
        for(int i=0;i<n;i++){
            int start =1;
            if(i%2==0){
                start =1;
            }
            else{
                start =0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println("");
        }
     
    }

    public static void pattern13(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }

            for(int j=0;j<=n*3-4*i;j++){
                System.out.print(" ");
            }

            for(int j =i+1;j>0;j--){
                System.out.print( j+" ");
            }
            System.out.println("");

        }

        }
    

   



    public static void main(String[] args){
        Patterns pattern = new Patterns();
        pattern.pattern13(5);

    }
}