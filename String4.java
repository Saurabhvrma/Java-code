import java.util.*;
public class String4{
    public static void main(String[]args){
        /*StringBuilder sb = new StringBuilder("Saurabh");
        System.out.println(sb);

        // Char at index 1
            System.out.println(sb.charAt(1));

        // set char at index 0
            sb.setCharAt(0, 'G');
            System.out.println(sb);

        // INSERT THE CHAR FRONT OF THE 0 INDEX
            sb.insert(0, 'S');
            System.out.println(sb);

        // INSERT THE n OF THE 2 INDEX
            sb.insert(2, 'n');
            System.out.println(sb);

        // delete the extra 'n'
            sb.delete(2,3);
            System.out.println(sb);

        // append the index -> adding any char in the last index

            StringBuilder sb = new StringBuilder("S");
            sb.append("a"); 
            sb.append("u");
            sb.append("r");
            sb.append("a");
            sb.append("b");
            sb.append("h");
            System.out.println(sb);
            System.out.println(sb.length());  */

        // To reverse the string

                StringBuilder sb = new StringBuilder("Saurabh");
                for(int i=0; i<sb.length()/2; i++){
                    int front = i;
                    int back = sb.length() - 1 - i; // 5-1-0>4

                    char frontChar = sb.charAt(front);
                    char backChar = sb.charAt(back);

                    sb.setCharAt(front, backChar);
                    sb.setCharAt(back, frontChar);
            }  
                System.out.println(sb);
    }
}