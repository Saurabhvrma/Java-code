import java.util.*;
public class Bits{
    public static void main(String[]args){

        //GET BITS OPERATIONS
/*
        int a = 6; // 0110 in binary
        int pos = 3;
        int bitMask = 2<<pos;

        if((bitMask & a)==0){
            System.out.println("bit was zero");
        } else{
            System.out.println("bit is one");
        } 

        // SET BITS OPERATIONS

        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n ;
        System.out.println(newNumber);


        // CLEAR BIT OPERATIONS

        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
*/

        // UPDATE BIT MASK OPERATIONS

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        


    }
}