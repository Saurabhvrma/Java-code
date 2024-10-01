/* 

    // QUESTIONS -> PRINT NUMBER FROM 5 TO 1.

class recursion{
    public static void printNumber(int n){
        if(n==0)
        return;
        System.out.print(n+" ");
        printNumber(n-1);
    }

        public static void main(String[]args){
            int n=5;
            printNumber(n);
        }
} 

     // QUESTIONS -> PRINT NUMBER FROM 1 TO 5.

class recursion{
    public static void printNumber(int n){
        if(n==6)
        return;
        System.out.print(n+" ");
        printNumber(n+1);
    }

        public static void main(String[]args){
            int n=1;
            printNumber(n);
        }
} 


    // QUESTIONS -> PRINT THE SUM OF FIRST N NATURAL NUMBERS;

    class recursion{
        public static void printSum(int i, int n, int sum){ // i-> tells about on which number we have, n-> base conditions
            if(i==n){
                sum += i;
                System.out.println(sum);
                return;
            }
                sum += i;
                printSum(i+1, n, sum);
                System.out.println(i);
        }
            public static void main(String[]args){
                printSum(1, 5, 0);
            }
} 

        // taking input from the users and sum the n natural number


import java.util.*;
class recursion{
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
            sum += i;
            printSum(i+1, n, sum);
            System.out.println(i);
    }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printSum(1, n, 0);
        }
} 

        // multiple of some natural number

class recursion{
    public static void printMultiple(int i, int n, int mult){
        if(i==n){
            mult *= i;
            System.out.println(mult);
            return;
        }
            mult *=i;
            printMultiple(i+1, n, mult);
    }
        public static void main(String[]args){
            printMultiple(1, 5, 1);
        }
} */



class recursion{
    public static void printFactorial(int n){
        if(n==1)
            return;
            System.out.print(n+ " ");
            printFactorial((n-1)*n);
        }
            public static void main(String[]args){
                int n=5;
                printFactorial(n);
            }
    } 