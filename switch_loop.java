// import java.util.*;
// class switch_loop{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int button = sc.nextInt();

//         switch(button){
//             case 1: System.out.println(a+b);
//             break;
//             case 2: System.out.println(a-b);
//             break;
//             case 3: System.out.println(a*b);
//             break;
//             case 4: System.out.println(a/b);
//             break;
//             default: System.out.println("Invalid no");
//         }
//     }
// }

import java.util.*;
public class switch_loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){
            case 1: 
            System.out.println("adult");
            break;
            case 2:
            System.out.println("Baby");
            break;
            default:
            System.out.println("not");
        }
    }
}


// import java.util.Scanner;
// public class Conditions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        switch(x){
//         case 1:System.out.println("Monday");
//         break;
//         case 2:System.out.println("Tuesday");
//         break;
//         case 3:System.out.println("Wednesday");
//         break;
//         case 4:System.out.println("Thrusday");
//         break;
//         case 5:System.out.println("Friday");
//         break;
//         case 6:System.out.println("Saturday");
//         break;
//         case 7:System.out.println("Sunday");
//         break;
//         default:
//         System.out.println("not valid");
//        }
//     }
// }