/*

import java.util.*;
public class if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        int x = age;
        if(x >70){
            System.out.println("You are Old");
        }else if(x >44){
            System.out.println("You are elder");
        }else if(x >30){
            System.out.println("You are in Tin ager");          
        }else if(x >20){
            System.out.println("You are Younger");
        }else{
            System.out.println("you are baby");
        }
    }
}

    // Questions->1.

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length value");
        int length = sc.nextInt();
        System.out.println(" Enter your breadth value");
        int breadth = sc.nextInt();
        if(length==breadth){
            System.out.println("Square");
        }else{
            System.out.println("rectangle");
        }
    }
}


    // Questions->2.

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x<y){
            System.out.println("y is greater than x");
        } else{
            System.out.println("x is greater than y");
        }
    }
}

    // Qusetions->3.

    // Case->1

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your unit");
        int unit = sc.nextInt();
        int one_unit_cost = 100;
        int total_cost = (100*unit);
        if(total_cost>1000){
            System.out.println((total_cost*10)/100);
            System.out.println(total_cost);
        } else{
            System.out.println("No any discount");
        }
    }
}

    //case-> 2.

import java.util.*;
class if_else{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter quantity");
    int x = sc.nextInt();
    if((x*100)>1000){
      System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
    }
    else{
      System.out.println("No discount");
    }
  }
} 

    // Questions -> 4.

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary");
        int Salary = sc.nextInt();
        int year = sc.nextInt();
        if(year>5){
            System.out.println("Net Bonus Amount : " +(Salary*5)/100);
        }else{
            System.out.println("Not got Bonus");
        }
    }
}  

    // Qestions -> 5

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int marks = sc.nextInt();
        if(marks<25){
            System.out.println("f");
        }else
        if(marks>=25 && marks<45){
            System.out.println("E");
        }else
        if(marks>=45 && marks<50){
            System.out.println("D");
        }else
        if(marks>=50 && marks<60){
            System.out.println("C");
        }else
        if(marks>=60 && marks<80){
            System.out.println("B");
        }else
        if(marks>80){
            System.out.println("A");
        }
    }
} 
        // Questions - 6.

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("he is in teenager");
        }else
        if(age>18 && age<40){
            System.out.println("he is younger");
        }else
        if(age>40){
            System.out.println("he is oldman");
        }
    }
}

    //  Question -> 7.

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        int x = sc.nextInt();
        System.out.println(x);
    }
}

    // Questions -> 8.

import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of held classes");
        int x = sc.nextInt();
        System.out.println("Enter the classes you attend");
        int y = sc.nextInt();
        double percentage = (double)y/x*100;
        if(percentage>=75){
            System.out.println("percentage : " +(double)percentage + "%");
            System.out.println("he is allow to sit in exam");
        }else{
            System.out.println("percentage : " +(double)percentage + "%");
            System.out.println("not allowed in exam");
        }
    }
}  */


    // Questions -> 9.

    // import java.util.*;
    // class if_else{
    //     public static void main(String[]args){
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter your number of held classes");
    //         int x = sc.nextInt();
    //         System.out.println("Enter the classes you attend");
    //         int y = sc.nextInt();
    //         double percentage = (double)y/x*100;
    //         System.out.println("Enter if you have medical cause ");
    //         String medical_cause = sc.next();
    //         if(percentage>=75 || medical_cause =="Y" || medical_cause=="N"){
    //             System.out.println("percentage : " +(double)percentage + "%");
    //             System.out.println("he is allow to sit in exam");
    //         }else{
    //             System.out.println("percentage : " +(double)percentage + "%");
    //             System.out.println("not allowed in exam");
    //         }
    //     }
    // }


//     import java.util.*;

// public class if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of classes held: ");
//         int totalClasses = sc.nextInt();

//         System.out.println("Enter the number of classes attended: ");
//         int attendedClasses = sc.nextInt();

//         double percentage = (double) attendedClasses / totalClasses * 100;

//         System.out.println("Enter if you have a medical cause (Y/N): ");
//         String medicalCause = sc.next();

//         if (percentage >= 75 || medicalCause.equalsIgnoreCase("Y")) {
//             System.out.println("Percentage: " + percentage + "%");
//             System.out.println("You are allowed to sit in the exam.");
//         } else {
//             System.out.println("Percentage: " + percentage + "%");
//             System.out.println("You are not allowed to sit in the exam.");
//         }
//     }
// }


//     // Questions -> 10

// import java.util.*;
// class if_else{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your year");
//         int year = sc.nextInt();
//         if(year%4==0 || year%400==0){
//             System.out.println("leap year");
//         }else{
//             System.out.println("not leap year");
//         }
//     }
// }

//     // Questions -> 11

// class if_else{
//     public static void main(String[]args){
//         int x = 2; 
//         int y = 5;
//         int z = 0;
//         System.out.println(x==2);
//         System.out.println(x != 5);
//         System.out.println( x != 5 && y >= 5);
//         System.out.println(z != 0 || x == 2);
//         System.out.println( !(y < 10));
//     }
// }


    // questions -> 12

//     import java.util.Scanner;

// public class if_else{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a character
//         System.out.print("Enter a character: ");
//         char ch = scanner.next().charAt(0);

//         // Check if the character is lowercase (a to z) using ASCII code
//         if (ch >= 'a' && ch <= 'z') {
//             System.out.println(ch + " is a lowercase character.");
//         }
//         // Check if the character is uppercase (A to Z) using ASCII code
//         else if (ch >= 'A' && ch <= 'Z') {
//             System.out.println(ch + " is an uppercase character.");
//         } else {
//             System.out.println(ch + " is not a lowercase or uppercase character.");
//         }

//         scanner.close();
//     }
// }


// import java.util.*;
// class if_else{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("Equal");
//         }else
//         if(a<b){
//             System.out.println("A is smaller than b");
//         } else
//         if(a>b){
//             System.out.println("a is greater than b");
//         }else{
//             System.out.println("invalid");
//         }
//     }
// }


import java.util.*;
class if_else{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namste");
            break;
            case 3: System.out.println("Good bye");
            break;
            case 4: System.out.println("banjour");
            break;
            default : System.out.println("Invalid");
        }
    }
}