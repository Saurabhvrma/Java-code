/*
public class operation{
    public static void main(String[]args){

        // unary ==> post-increament (first- change the value / sec- aasing(used old value))

        int a = 10;
        int b = 0;
        b = a++;
        System.out.println(a);
        System.out.println(b);

       // unary ==> pre-increament (first- assign(use old values)valu / sec- change the value)

        int x = 10;
        int y = 0;
        y = ++ x;
        System.out.println(x);
        System.out.println(y);

        // unary ==> pre-decremwnt (first- assign(use old values)valu / sec- change the value)

        int c = 10;
        int d = 0;
        d = --c;
        System.out.println(c);
        System.out.println(d);

        // unary ==> post-decremwnt (first- change the value / sec- aasing(used old value))

        int e = 20;
        int f = 0;
        f = e--;
        System.out.println(e);
        System.out.println(f);  

    }
}  


class operation{
    public static void main(String[]args){
        int x = 5;
        int y = 7;
        System.out.println("area of rectangle : " + x*y);
        System.out.println("perimeter of rectangle : " + 2*(x+y));
    }
}  


class operation{
    public static void main(String[]args){
        int x = 2;
        int y = 3;
        int z = 5;
        int perimeter = x+y+z;
        System.out.println(perimeter);
    }
}  


class operation{
    public static void main(String[]args){
        int x = (2345+8)/(3);
        System.out.println(((x)%5)*5);
    }
} 


class operation{
    public static void main(String[]args){
        int a = 2345;
        int b = 8;
        int c = 3;
        int d = 5;
        int e = 5;
        a+=b;   // (a=a+b)
        a/=c;   // (a=a/c)
        a%=d;   // (a=a%d)
        a*=e;   // (a=a*e)
        System.out.println(a);
    }
} 


class operation{
    public static void main(String[] args) {
            // Given numbers
            int number1 = 23;
            int number2 = 45;
    
            // Check if the numbers are equal
            boolean result =(number1==number2);
    
            // Display the result
            System.out.println(result);
    }
} 


class operation{
    public static void main(String[]args){
        int x = 23;
        int y = 45;
         boolean equal = (x==y);
         System.out.println(equal);
    }
}  


import java.lang.Math;
class operation{
    public static void main(String[] args){
        System.out.println(Math.pow(7,5));
    }
} 


class operation{
    public static void main(String[]args){
        int x = 55;
        int y = 70;
        boolean z = (x<50 && x<y);
        System.out.println(z);
    }
} 


class operation{
    public static void main(String[]args){
        int a = 55;
        int b = 70;
        boolean z = (a<50 || a<b);
        System.out.println(z);
    }
} 



class operation{
    public static void main(String[]arga){
        int maths = 78;
        int english = 45;
        int computer = 62;
        int total_marks = maths + english + computer;
        System.out.println(total_marks);
        System.out.println((double)((total_marks)*100)/300);
    }
}  


class operation{
    public static void main(String[]args){
        int a = 6;
        int b = 8;
         // using third variables

        int temp = a;
        a=b;
        b=temp;

        // without using a third variables

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
} 


import java.util.*;
class operation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float Celsius = sc.nextInt();
        System.out.println((float)(Celsius*9/5)+32);

    }
}  

// CASE->1

class operation{
    public static void main(String[]args){
        int x = 90;
        int boys = 45;
        int tottal_no_of_student_secured_A_grade = (((90*50)/100)-20);
        System.out.println(tottal_no_of_student_secured_A_grade);
    }
}

// CASE->2

public class operation {
    public static void main(String[] args) {
        // Given information
        int totalStudents = 90;
        int boys = 45;
        double gradeAPercentage = 50.0;
        int gradeABoys = 20;

        // Calculate the total number of students who secured grade 'A'
        double gradeAStudents = (gradeAPercentage / 100) * totalStudents;

        // Calculate the total number of girls getting grade 'A'
        int girlsGradeA = (int) (gradeAStudents - gradeABoys);

        // Display the result
        System.out.println("Total number of girls getting grade 'A': " + girlsGradeA);
    }
}  


// import java.util.*;
// class operation{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int z = sc.nextInt();
//         int v = sc.nextInt();
//         int u = sc.nextInt();
//         System.out.println(x+v);
//     }
// }


class operation{
    public static void main(String[] args){
      int n, first, second, third, forth, fifth, sum;
      n = 23462;
    //   Now we will take out each digit of this number and then finally add the first and the second last digits
      first = n/10000;     //first digit
      n = n%10000;
      
      second = n/1000;     //second digit
      n = n%1000;
      
      third = n/100;       //third digit
      n = n%100;
      
      forth = n/10;        //forth digit
      fifth = n%10;        //fifth digit
      
      sum = first + forth;
      System.out.println("sum : "+sum);
    }
  } 


import java.util.*;
  class operation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit1 = number / 100;         // Extract the hundreds digit
        int digit2 = (number / 10)%10;   // Extract the tens digit
        int digit3 = number % 10;          // Extract the units digit
        int sum = digit1 + digit2 + digit3; // Calculate the sum
        System.out.println(sum);
    }
  }  

// CASE->1

  import java.util.*;
  class operation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit1 = (number / 1000 + 2) % 10;
        int digit2 = ((number / 100) % 10 + 2) % 10;
        int digit3 = ((number / 10) % 10 + 2) % 10;
        int digit4 = (number % 10 + 2) % 10;
        int corresponding_digit = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;    
        System.out.println(corresponding_digit);
    }
  } 

// CASE->2

  import java.util.*;
  class operation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit1 = (number / 1000 +2)%10; 
        int digit2 = (number / 100 +2)%10;   
        int digit3 = (number / 10 +2)%10;
        int digit4 = (number % 10 +2)%10;
        int corresponding_digit = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;    
        System.out.println(corresponding_digit);
    }
  }  


  import java.util.*;
  class operation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit1 = (number / 100);
        int digit2 = (number / 10)%10;
        int digit3 = (number %10);
        int reverse = digit3*100 + digit2*10 + digit1;
        System.out.println(reverse); 
    }
  }  */