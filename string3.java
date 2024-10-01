import java.util.*;
public class string3{
        public static void main(String[]args){
            // Scanner sc = new Scanner(System.in);
            // String name = sc.nextLine();
            // System.out.println("Your name is : "+ name);

            //Concatenation

        //     String firstName = "Saurabh";
        //     String lastName = "Bharti";
        //     String fullName = firstName + " " + lastName;
        //    System.out.println(fullName.length());

        //     //CharAt

        //     for(int i=0; i<fullName.length(); i++){
        //         System.out.println(fullName.charAt(i));
        //     }

            // Compare

/*String name1 = "Saurabh";
            String name2 = "Saurabh";

            // 1. s1 > s2 : +ve value
            // 2. s1 == s2 : 0
            // 3. s1 < s2 : -ve value

            if(name1.compareTo(name2)==0){
                System.out.println("String is equal");
            } else{
                System.out.println("String are not equal");
             }  */

             // To take two string input from the users and compare to String1 and String2 


            //  Scanner sc = new Scanner(System.in);
            //  String name1 = sc.nextLine();
            //  String name2 = sc.nextLine();
            //  if(name1.compareTo(name2)==0){
            //     System.out.println("String is equal");
            //  } else{
            //     System.out.println("String is not equal");
            //  }


            // for sub-string
            
            String sentence = "My name is Saurab";
            String name = sentence.substring(11, sentence.length());
            System.out.println(name);


     }
}