/*   // Questions  .1.

import java.util.*;
public class Bubble_practices{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }
          System.out.println();
    }
        public static void main(String[]args){
        int arr[] = {4, 1, 3, 9, 7};
        int n = 5;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]> arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
         }
    }
        printArray(arr);
    }
}

           // Question 2.

import java.util.*;
class Bubble_practices{
    public static void printArray(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
            System.out.println();
    }

    public static void main(String[]args){
        int n=10;
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            printArray(arr);
    }
}

        //  Questions no. 3

import java.util.*;
class Bubble_practices{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

        public static void main(String[]args){
            int arr[] = {0,2,1,2,0};
            int n=5;
            for(int i=0; i<n-1; i++){
                for(int j=0; j<n-i-1; j++){
                    if(arr[j]> arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
                printArray(arr);
        }
} 

        // Questions 4.  taking some arr inputs from the users and then sorting the array

import java.util.*;
class Bubble_practices{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int size =sc.nextInt();
            int arr[]= new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<size-1; i++){
                for(int j=0; j<size-i-1; j++){
                    if(arr[j]> arr[j+1]){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
                printArray(arr);

        }
} 
            // Questions no. 5;


import java.util.*;
class Bubble_practices{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

        public static void main(String[]args){
            int arr[]= {4, 5, 6, 7, 3, 9};
            int n = 6;
            for(int i=0; i<n-1; i++){
                for(int j=0; j<n-i-1; j++){
                    if(arr[j]> arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1]= arr[j];
                        arr[j]= temp;
                    }
                }
            }
                printArray(arr);
        }
} */