import java.util.*;
public class strings{
    public static void main(String[]args){
        String name = new String("Harry");
        //String name = "Harry";
        System.out.println(name); // println means next line;
        System.out.print("the name is");

        int a = 6;
        float b = 5.875f;
        System.out.printf("the valu of a is %d and the value of b is %f",a,b);

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        //String st = sc.nextLine();
        //System.out.println(st);
    }
}