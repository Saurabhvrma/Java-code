/*import java.util.*;
public class Arrays_Practics{
    public static void main(String[] args) {

        //Practice Problem-1.

            float [] marks = {45.7f, 67.8f, 78.4f, 54.5f, 494.0f};
            float sum=0;
            for(float element:marks){
               sum=sum + element;
            }
            System.out.println("The value of sum is " +sum);

        Practice Problem-2.

            float [] marks = {45.7f, 67.8f, 78.4f, 54.5f, 494.0f};
            float num=67.8f;
            boolean isInArray = false;
            for(float element:marks){
               if(num==element){
                   isInArray = true;
                   break;
            }
            }
            if(isInArray){
                  System.out.println("The value is present in array");
         }
              else{
                 System.out.println("The value not present in array");
         }


        //Practice Problem-3.
        
             float [] marks = {45.7f, 67.8f, 78.4f, 54.5f, 494.0f};
             float sum=0;
             for(float element:marks){
                sum=sum + element;
             }
             System.out.println("The value of avarage marks is " +sum/marks.length);


        //Practice Problem-4.

                 int [][] mat1 = {{1, 2, 3},
                                 {4, 5, 6}};
                 int [][] mat2 = {{2, 2, 3},
                                 {4, 5, 6}};
                 int [][] result = {{0, 0, 0},
                                   {0, 0, 0}};

                 for(int i=0; i<mat1.length; i++){  //row number of times
                     for(int j=0; j<mat1[i].length; j++){  //column number of time
                         System.out.format("Setting value for i=%d and j=%d\n",i,j);
                       result[i][j] = mat1[i][j] + mat2[i][j];
                     }
                 }

        // taking input from users 


         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int number[]= new int[size];

           // // input

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // output 

        for(int i=0; i<size; i++){
        System.out.println(number[i]);
         }

        // Take a arry from as input from the users. Search for a given number x and print the index at which it occurs 

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]= new int[size];
        
        // input

        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output 

        for(int i=0; i<number.length; i++){
           if(number[i]==x){
            System.out.println("we found the number"+i);
           }
        }

    }
} */