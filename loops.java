//public class loops{
//  public static void main(String[] args) {
    //     int i = 100;
    //   while(i<200){
    //     System.out.println(i);
    //   i++;
    //    }
//    }
//}

     //do-while loops

// public class loops{
//     public static void main(String[] args) {
//         int a = 0;
//         do{
//             System.out.println(a);
//             a++;
//         }
//         while(a<5);
//     }
// }


// public class loops{
//     public static void main(String[] args) {
//         int a = 10;
//         do{
//             System.out.println(a);
//             a++;
//         }
//         while(a<5);
//     }
// }


// public class loops{
//     public static void main(String[] args) {
//         int a = 1;
//         do{
//             System.out.println(a);
//             a++;
//         }
//         while(a<10);
//     }
// }


        //for_loops

// public class loops{
//     public static void main(String[] args) {
//         for(int i=1; i<21; i=i+2){
//         System.out.println(i);
//     }
// }
// }


// public class loops{
//     public static void main(String[] args){
//         for(int i=1; i<50; i++){
//         System.out.println(2*i+1);
//     }
// }
// }

        //Decrementation for loops

// public class loops{
//     public static void main(String[] args) {
//         int n = 1;
//         for(int i=50; i>=n; i--){
//             System.out.println(i);
//         }
//     }
// }



                    //QUESTIONS PRACTICES SET 5;
                

// public class loops{
//     public static void main(String[] args){
//         int n=1;
//         for(int i=5; i>=n; i++){
//                 for(int j=i; j<i; j++)
//                 System.out.print("*");
//         }
//         System.out.println("*");
// }
// }

// import java.util.*;
// class loops{
//         public static void main(String[]args){
//                 Scanner sc = new Scanner(System.in);
//                 int x = sc.nextInt();
//                 for(int i=1; i<11; i++){
//                         System.out.println(i*x);
//                 }
//         }
// }

// public class loops{
//             public static void main(String[] args) {
//                 for(int i=1; i<21; i=i+2){
//                 System.out.println(i);
//             }
//         }
//         }

// public class loops{
//             public static void main(String[] args){
//                 for(int i=1; i<50; i++){
//                 System.out.println(2*i+1);
//             }
//         }
//         }


// class loops{
//         public static void main(String[]args){
//                 for(int i=1; i<=5; i++){
//                         for(int j=i; j<=5; j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println(" ");
//                 }
//         }
// }

// class loops{
//         public static void main(String[]args){
//                 for(int i=1; i<=4; i++){
//                         for(int j=1; j<=4; j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println(" ");
//                 }
//         }
// }

// class loops{
//         public static void main(String[]args){
//                 int n =4;
//                 int m= 5;
//                 for(int i=1; i<=n; i++){
//                         for(int j=1; j<=m; j++){
//                         if(i==1 || j==1 || i==n || j==m){
//                                 System.out.print("*");
//                         }else{
//                                 System.out.print(" ");
//                         }
//                         }
//                         System.out.println();
//                 }
//         }
// }

import java.util.*;
class loops{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int n = 4;
                for(int i=1; i<=4; i++){
                        for(int j=1; j<=i; j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }
}