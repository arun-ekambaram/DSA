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
    public static void pattern14(int n){
        int c=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c=c+1;
            }
            System.out.println("");
        }
    }

    public static void pattern15(int n){
        for(int i=0;i<=n;i++){
            int a=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)a);
                a=a+1;
            }
            System.out.println("");
            
        }
    }
    public static void pattern16(int n){
        int a=65;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print((char)a);
            }
            a++;
            System.out.println("");
            
        }
    }
    public static void pattern17(int n){
       
        for(int i=0;i<n;i++){
            int a=65;
            int c;
            int count=0;
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<i*2+1;j++){
                // char c=(char)a
                c=2*i/2 + 1;
                System.out.print((char)a);
                count++;
                if(count< c){
                     a++;
                }
                else{
                    a--;
                }
            
            }
            
            System.out.println("");
            
        }
}
            
    // public static void pattern18(int n){
    //     char c;
    //     for(int i=0;i<=n;i++){
    //         c='A' + n-1;
    //         for(int j=1; j<=i;j++){

    //             System.out.print((char)c+" ");
    //             c--;
    //         }

    //         System.out.println("");
    //     }
    // }    
    

   
    public static void pattern19(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=n*2-i*2-3;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
      
    }
        public static void pattern20(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print("*");
                }
                for(int j=0;j<n*2-i*2-2;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=0;i<n;i++){
                for(int j=1;j<n-i;j++){
                    System.out.print("*");
                }
                for(int j=0;j<i*2+2;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<n-i;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

           
        }

        public static void pattern20_1(int n){
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void pattern21(int n){
        
            for(int i=0;i<n;i++){
                if(i==0 || i==n-1){
                    for(int k=0;k<n;k++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                else{
                for(int j=1;j<2;j++){
                    System.out.print("*");
                }
                for(int j=1;j<n-1;j++){
                    System.out.print(" ");
                }

                for(int j=1;j<2;j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
    }
        
        public static void pattern22(int n){
        //    
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<=2*n-2;j++){
                int top =i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2) -i;

                int m;
                m= n- Math.min(Math.min(top,down),Math.min(left,right));
                System.out.print(m+" ");
            }
            System.out.println("");
        }
        }







    public static void main(String[] args){
        Patterns pattern = new Patterns();
        pattern.pattern22(4);

    }
}