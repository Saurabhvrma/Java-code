 /* import java.util.*;
public class SelectionSorting{
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
         System.out.println();
    }

    public static void main(String[]args){
        int arr[] = {7, 8, 3, 1, 2};

            // let assume that '7' is the smallest no. '7' is on the '0' index , '8' is on the '1' index and so on.... 

        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
        }
            printArray(arr);
    }
} 


import java.util.*;
class SelectionSorting{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }
        public static void main(String[]args){
            int arr[] = {9,4,8,5,7,3};
            for(int i=0; i<arr.length-1; i++){
                int smallest = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[smallest]> arr[j]){
                        smallest = j;
                    }
                }
                    int temp = arr[smallest];
                        arr[smallest]= arr[i];
                        arr[i]= temp;
            }
                printArray(arr);
        }
}


import java.util.*;
class SelectionSorting{
    public static void printArray(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

    public static void main(String[]args){
        int arr[] = {6,7,5,9,4};
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
            printArray(arr);
    }
} 


import java.util.*;
class SelectionSorting{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

        public static void main(String[]args){
            int arr[] = {6, 5, 4, 3};
            for(int i=0; i<arr.length-1; i++){
                int smallest = i;
                for(int j= i+1; j<arr.length; j++){
                    if(arr[smallest]>arr[j]){
                        smallest =j;
                    }
                }
                        int temp = arr[smallest];
                        arr[smallest]= arr[i];
                        arr[i]=temp;
            }
                printArray(arr);
         }
} 

    // taking some arr inputs from the users and then sorting the array

import java.util.*;
class SelectionSorting{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                    for(int i=0; i<size; i++){
                        arr[i] = sc.nextInt();
                    }
                for(int i=0; i<arr.length-1; i++){
                    int smallest = i;
                    for(int j= i+1; j<arr.length; j++){
                        if(arr[smallest]> arr[j]){
                            smallest= j;                          
                        }
                    }
                        int temp = arr[smallest];
                        arr[smallest]= arr[i];
                        arr[i]= temp;
                }
                    printArray(arr);
    }
} 


import java.util.*;
class SelectionSorting{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
        }
                for(int i=0; i<arr.length-1; i++){
                    int smallest= i;
                    for(int j=i+1; j<arr.length; j++){
                        if(arr[smallest]> arr[j]){
                            smallest = j;
                        }
                    }
                        int temp = arr[smallest];
                        arr[smallest] = arr[i];
                        arr[i] = temp;
                }
                    printArray(arr);
    }
} */