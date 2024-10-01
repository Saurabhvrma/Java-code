/* 
import java.util.*;
public class input{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

         //Question No.3;

         String name = sc.next();
         System.out.println("Hello have a god day");

        //Questions No.4;

        double km =sc.nextInt();
        double miles=(km*0.621371192);
        System.out.println(miles);
        System.out.println(sc.hasNextInt());

        //Questions No.5;

        int maths=sc.nextInt();
        int hindi=sc.nextInt();
        int english=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        float percentage=(maths+hindi+english+physics+chemistry)*100/500;
        System.out.println(percentage);

        //Questions No.6;


        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println(sum);
        int product = x*y;
        System.out.println(product);


        //Questions No.7;


        int G = sc.nextInt();
        int D = sc.nextInt();
        int sum = G + D;
        int product = G*D;
        System.out.println(sum);
        System.out.println(product);

        //Questions No.8;


        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double area = x*y;
        System.out.println((int)area);


        //Questions No.9;


        String xyz = sc.nextLine();
        String str = sc.nextLine();
        int abc = sc.nextInt();
        System.out.println("Hey my name is " +xyz+ " and my roll no is " +abc+ " .My field of intrest are " +str+ " . ");
       
            //Questions No.10;


        int side = sc.nextInt();
        int area = side*side;
        int perimeter = 4*side;
        System.out.println("area : "+area+  "\nperimeter : " +perimeter);

           // Questions No.11;


        int x = sc.nextInt();
        int square = x*x;
        System.out.println(square);

        // Questions No.12;


        String xyz = sc.next();
        String str = sc.next();
        System.out.print(xyz +str);

        // Questions No.13;


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("All are equal : "+(a==b&&b==c&&c==a));
        System.out.println("Any two are equal :"+(a==b||b==c||c==a)); 


        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int s = (x*x-4*y*z)/(2*z);
        System.out.println((double)s);


        int y = 7;
        int x =8*y++;
        System.out.println(x);


        // Practice set 2.

        // Questions No 1.


        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);


        // Questions No. 3.


        int x = 56;
        int y = sc.nextInt();
        System.out.println(x>y);


        // Questions No.4;

        int v = sc.nextInt();
        int u = sc.nextInt();
        int a = sc.nextInt();
        int s = sc.nextInt();
        float x =(float)(v*v-u*u)/(2.0f*a*s);
        System.out.println(x);


    }
}


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum : " + (x+y));
        System.out.println("product : " + (x*y));
    }
} 


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x+y;
        int v = x*y;
        System.out.println("sum : " +z+ "\n product : " +v);
    }
}


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println((int)(length*breadth));
    }
} 


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your roll_no");
        String roll_no = sc.nextLine();
        System.out.println("Enter your field intrest");
        String field = sc.nextLine();
        System.out.println("Hey, my name is " +name+ " and my roll number is " + roll_no+ " . My field of interest are " +field);
    }
}

    / case -> 1

import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your roll number");
        String roll_no = sc.nextLine();
        System.out.println("Enter your field intrest");
        String field = sc.nextLine();
        System.out.println("Hey, my name is " +name+ " and my roll number is " +roll_no+ ". My field intrest are " +field);
    }
}

    // case-> 2

 import java.util.Scanner;
 class inout{
   public static void main(String[] args){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter name");
     String a = s.nextLine();
     System.out.println("Enter roll number");
     String b = s.nextLine();
     System.out.println("Enter Filed of interest");
     //s.next();//To consume '\n' left by ENTER KEY, it is not consumed by nextInt()
     String c = s.nextLine();
     System.out.println("Hey, my name is "+a+" and my roll number is "+b+". My field of interest are "+c);
   }
}


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int side = sc.nextInt();
        System.out.println("area : " +(side*side)); 
        System.out.println("perimeter : " +(4*number));
    }
} 


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        System.out.println("Square : " +(number*number));
    }
}


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        System.out.print(x);
        System.out.print(y);
    }
}  


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("All are equal : " +(x==y && y==z && x==z));
        System.out.println("Any of two are equal : " +(x==y || y==z || x==z));
    }
} 


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 50;
        System.out.println(a<50);
        System.out.println(a<b);
    }
}


import java.util.*;
class input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int Computer_Science = sc.nextInt();
        int total_marks = (maths+science+Computer_Science);
        double percentage = (maths+science+Computer_Science)*100/300;
        System.out.println(total_marks);
        System.out.println((double)+percentage);
    }
}  */