package sorting;

import java.util.Scanner;

public class sorting{
    void selectionsort(int [] array,int n ){
        for(int i=0;i<n-2;i++){
            int mini=i;
            for(int j=i;i<n-1;j++){
                if(array[j]<array[mini]){
                    array[j]= array[mini];
                    temp=

                }

            }
        }



    }




public static void main(String[] args){
    int n;
    sorting pattern = new sorting();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int [] array = new int[10];
    for(int i=0;i<n;i++){
        array[i] =  sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(array[i]);

    }


}
}