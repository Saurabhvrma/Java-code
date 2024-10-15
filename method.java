// public class methods{
//     static int logic(int x, int y){
//         int z;
//         if(x>y){
//             z = x+y;
//     }
//     else{
//         z = (x+y)*5;
//     }
//     return z;
// }

//     public static void main(String[] args) {

//         int a = 3;
//         int b = 4;
//         int c =logic(a, b);
//         System.out.println(c);
//     }
// }


// public class methods{
//     public static void main(String[]args){
//         greet(); // call the functions: 
//     }

//     static void greet(){
//         String message = "Hello";
//         System.out.println(message);
//     }
// }


// import java.util.*;
// public class methods{
//     public static void main(String[]args){
//        int ans = sum();
//        System.out.println(ans);
//     }

//     static int sum(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your fisrt number : ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter your second number : ");
//         int num2 = sc.nextInt();
//         System.out.println("Your final answer is : ");
//         int sum = num1 + num2;
//         return sum;
//     }
// }


// public class methods{
//     public static void main(String[]args){
//         String message = greet();
//         System.out.println(message);
//     }

//     static String greet(){
//         String message = "Hello Saurabh";
//         return message;
//     }
// }


// public class methods{
//     public static void main(String[]args){
//         int ans = sum(20,30);
//         System.out.println(ans);
//         int ans1 = sub(23,20);
//         System.out.println(ans1);
//         int ans2 = mult(23,20);
//         System.out.println(ans2);
//         int ans3 = div(23,20);
//         System.out.println(ans3);
//         int ans4 = modu(23,20);
//         System.out.println(ans4);
//     }

//     static int sum(int a , int b ){
//         int sum = a+b;
//         return sum;
//     }

//     static int sub(int a, int b){
//         int sub = a-b;
//         return sub;
//     }

//     static int mult(int a, int b){
//         int mult = a*b;
//         return mult;
//     }

//     static int div(int a, int b){
//         int div = a/b;
//         return div;
//     }

//     static int modu(int a, int b){
//         int modu = a%b;
//         return modu;
//     }
// }


// public class methods{
//     public static void main(String[]args){
//        String greeting =  myGreet("Saurabh");
//        System.out.println(greeting);
//     }

//     static String myGreet(String name){
//         String message = "Hello " + name;
//         return message;
//     }
// }


// class methods{
    
//     public static void printInput(String S, int N) {
//         System.out.println("The input string :" + S);
//         System.out.println("The input integer :" + N);
//     }

//     public static void main(String[] args) {
//         String S = "GeeksforGeeks";
//         int N = 20;

//         // Call the function with the given inputs
//         printInput(S, N);
//     }
// }


// Input:
// a = 5.43, b = 2.653
// Output:
// 2.0467393 2.047
// Explanation:
// a/b and decimal precision of a/b up to 3 places after the decimal point are given.

// public class methods{
//     public static void main(String[]args){
//         float a  = 6.43f;
//         float b = 3.54f;

//         printInFormat(a,b);

//     }

//     public static void printInFormat(float a, float b){
//         float result = a/b;
//         System.out.print(result + " ");
//         System.out.format("%.2f", + result);
//     }
// }


// Example 2:

// Input: 
// a = 3.25, b = 2.5
// Output: 
// 1.3 1.300
// Explanation:
// a/b and decimal precision of a/b up to 3 places after the decimal point are given.


// public class methods{
//     public static void main(String[]args){
//         float a = 3.25f;
//         float b = 2.5f;

//         printInFormat(a, b);
//     }

//     public static void printInFormat(float a, float b){
//         float result = a/b;
//         System.out.print(result + " ");
//         System.out.printf("%.3f", + result);
//     }
// }


// the input string : GreekforGreek
// the input integer : 20


// class methods{
//     public static void main(String[]args){
//         String S = "GreekforGreek";
//         int N = 20;

//         printIntString(S,N);
//     }

//     static void printIntString(String S, int N){
//         System.out.println("The input String: " + S);
//         System.out.println("The input integer: " + N);
//     }
// }


// this is 
// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as
// System.console() may require console
// public class Sample {
//     public static void main(String[] args)
//     {
//         // Using Console to input data from user
//         String name = System.console().readLine();

//         System.out.println("You entered string " + name);
//     }
// }

// import java.util.Scanner;

// class Sample {

//     // Function to take input using Scanner class
//     static void IOFunction() {
//         Scanner sc = new Scanner(System.in);  // Scanner to take input
//         int t = sc.nextInt();  // Number of test cases or inputs

//         // Loop through each test case
//         while (t-- > 0) {

//             // Input for int, float, long, and String
//             int a = sc.nextInt();         // Reading integer
//             float b = sc.nextFloat();     // Reading float
//             long c = sc.nextLong();       // Reading long integer
//             byte d = sc.nextByte();
//             sc.nextLine();         // Reading another integer                // Consume the newline character left after reading int
//             String s = sc.nextLine();     // Reading the string

//             // Printing the inputs
//             System.out.println(a);
//             System.out.println(b);
//             System.out.println(c);
//             System.out.println(d);
//             System.out.println(s);
//         }
//     }

//     public static void main(String[] args) {
//         IOFunction();  // Calling the function
//     }
// }


// class Sample {
//     static String toLower(String s) {
//         return s.toLowerCase();
//     }
    
//     public static void main(String[]args){
//         String s = "ABCddE";
//         System.out.println(toLower(s));
//     }
// }



// class Sample {
//     static String revStr(String s) {
//          for(int i=13; ; i--){
//             System.out.println(i);
//         }
//     }
    
//     public static void main(String[]args){
//         String s = "GeeksfroGeeks";
//         System.out.println(revStr(s));
//     }
// }


class Sample{
    public static void main(String[]args){
        String arr [] = {"GeeksforGeeks"};
         
    }
}
