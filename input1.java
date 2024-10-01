import java.util.*;
public class input1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        int mult = x*y;
        int div=x/y;
        int sub = x-y;
        System.out.println(sum);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(sub);
    }
}