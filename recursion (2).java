    // recursion tree diagonal for fibonacci series

// import java.util.*;
// class recursion{
//     static int fib(int N){
//         if(N == 0 || N ==1)
//         return N;
//         return fib(N-1)+fib(N-2);
//     }
//         public static void main(String[]args){
//             System.out.println("factorial of" +3+" " +fib(3));
//             System.out.println("factorial of" +4+" " +fib(4));
//             System.out.println("factorial of" +5+" " +fib(5));
//         }
// }

    // how to memory allocated to different functions calls in recursions

// class recursion{
//     static void printFun(int test){
//         if(test<1)
//         return;
//         else {
//             System.out.printf(" %d ", test);
//             printFun(test-1);
//             System.out.printf(" %d ",test);
//             return;
//         }
//     }
//         public static void main(String[]args){
//             int test =3;
//             printFun(test);
//     }
// }

// Java Program to implement
// Factorial using recursion
class GFG{

	// recursive method
	int fact(int n)
	{
		int result;

		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

// Driver Class
class recursion{

	// Main function
	public static void main(String[] args)
	{
		GFG f = new GFG();

		System.out.println("Factorial of 3 is "
						+ f.fact(3));
		System.out.println("Factorial of 4 is "
						+ f.fact(4));
		System.out.println("Factorial of 5 is "
						+ f.fact(5));
	}
}
