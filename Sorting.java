import java.util.*;
    public class Sorting{
        public static void printArray(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
        }
            System.out.println();
            }
            public static void main(String[]args){
            int arr [] = {7,8,3,1,2};

            // bubble sort (for accending order)

            // for(int i=0; i<arr.length-1; i++){
            //     for(int j=0; j<arr.length-i-1; j++){
            //         if(arr[j] > arr[j+1]){
            //             //swap => its means taking two elements 1 and 2 and then change the value positins 
            //             int temp = arr[j]; // array of [j] is stored any where 
            //             arr[j] = arr[j+1];
            //             arr[j+1] = temp;
            //         }
            //     }
            // }

                    // bubble sort (for decending ordr)

               for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-i-1; j++){
                    if(arr[j] < arr[j+1]){
                        //swap => its means taking two elements 1 and 2 and then change the value positins 
                        int temp = arr[j]; // array of [j] is stored any where 
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
              
            printArray(arr);
    }
}