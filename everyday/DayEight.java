
// print the number from n to 1 using loop
// public class DayEight
// {
//     public static void printNumbers(int n)  
//     {
//         for (int i = n; i >= 1; i--)
//         {
//             System.out.println(i);   
//         }
//     }    
//     public static void main(String[] args)
//     {
//         int n = 5;
//         System.out.println("Printing numbers from N to 1 using loop");
//         printNumbers(n);
//     }







// // without reccursion
// public class DayEight 
// {
//     public static void printMessage(int n)
//     {
//         for(int i = 1; i <= n; i++) 
//         {
//             System.out.println("Hello");
//         }
//     }    


//     public static void main(String[] args)
//     {
//         int n = 5; // You can change this value to print more or fewer messages
//         System.out.println("Using looping");

//         printMessage(n);
//     }
// }


// // using recursion
// public class DayEight 
// {
//     public static void printMessage(int n)
//     {
//         if (n == 0) 
//         {
//             return; 
//         }
//         System.out.println("Hello");
//         printMessage(n - 1); 
//     }    

//     public static void main(String[] args)
//     {
//         int n = 5; 
//         System.out.println("Using recursion");

//         printMessage(n);
//     }
// }

// // print the from N to 1 using recursion
// public class DayEight
// {
//     public static void printNumbers(int n) 
//     {
//         if (n < 1) 
//         {
//             return; 
//         }
//         System.out.println(n);
//         printNumbers(n - 1); 
//     } 
//     public static void printNumbersloop(int n)  
//     {
//         for (int i = n; i >= 1; i--)
//         {
//             System.out.println(i);   
//         }
//     }    
//     public static void main(String[] args)
//     {
//         int n = 5; 
//         System.out.println("Printing from N to 1 using recursion");
//         printNumbers(n);

//         System.out.println("Printing from N to 1 using loop");
//         printNumbersloop(n);
//     }
// }

// //  write factorial using recurrsion and loop
// public class DayEight
// { 
//     public static int factorialRecursion(int n)
//     {
//         if (n == 0 || n == 1)
//         {
//             return 1;
//         }
//         return n * factorialRecursion(n - 1);    
//     }
//     public static int factorialLoop(int n)
//     {
//         int result = 1;  
//         for (int i = 2; i <= n; i++)
//         {
//             result *= i;
//         }
//         return result;
//     }
//     public static void main(String[] args)
//     {
//         int n = 5; 
//         System.out.println("Factorial of " + n + " using recursion: " + factorialRecursion(n));
//         System.out.println("Factorial of " + n + " using loop: " +
//     factorialLoop(n));
//     }
// }


// recursion
//  method
// public class DayEight
// {
//     // // method
//     // public static void Hellomydear(int n)
//     // {
//     //     for(int i=1; i<=n; i++)
//     //     {
//     //         System.out.println("Hello my dear");
//     //     }
//     // }
//     // public static void main(String[] args)
//     // {
//     //     int n = 10;
//     //     System.out.println("Using looping");
//     //     Hellomydear(n);
//     // }


//     public static void Hellomydear(int n)
//     {
//         if (n == 0) 
//         {
//             return; 
//         }
//         System.out.println("Hello my dear");
//         Hellomydear(n - 1); 
//     }
//     public static void main(String[] args)
//     {
//         int n = 10;
//         System.out.println("Using recursion");
//         Hellomydear(n);
//     }
// }

// import java.util.*;
public class DayEight
{
    // // 1. Factorial number using recursion user input
    // public static Scanner Scaner = new Scanner(System.in);
    // public static int factorialRecursion(int n)
    // {
    //     if (n == 0 || n == 1)
    //     {
    //         return 1;
    //     }
    //     return n * factorialRecursion(n - 1);    
    // }
    
    // public static void main(String[] args)
    // {
    //     System.out.print("Enter a number to calculate its factorial: ");
    //     int n = Scaner.nextInt();
    //     System.out.println("Factorial of " + n + " using recursion: " + factorialRecursion(n));
    // }

    // //  2. Fibonacci series using recursion until 10 place
    // public static int fibonacciRecursion(int n) 
    // {
    //     if (n <= 1) 
    //     {
    //         return n; 
    //     }
    //     return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2); 
    // }

    // public static void main(String[ ]args)
    // {
    //     System.out.print("Fibonacci series up to 10 places: ");
    //     for (int i = 0; i < 10; i++) 
    //     {
    //         System.out.print(fibonacciRecursion(i) + " ");
    //     }
    //     System.out.println();
    // }

    // 3. Sum of First N natural numbers using recursion
    // public static int sumOfNaturalNumbers(int n) 
    // {
    //     if (n <= 0) 
    //     {
    //         return 0; 
    //     }
    //     return n + sumOfNaturalNumbers(n - 1); 
    // }
    // public static void main(String[] args)
    // {
    //     int n = 10;
    //     System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumOfNaturalNumbers(n));
    // }

    // 4. Print the even numbers from 2 to N using recursion
    public static void printEvenNumbers(int n)
    {
        if (n < 2) 
        {
            return; 
        }
        printEvenNumbers(n - 1); 
        if (n % 2 == 0) 
        {
            System.out.print(n + " "); 
        }
    }
    public static void main(String[] args)
    {
        int n = 20; // You can change this value to print even numbers up to a different limit
        System.out.print("Even numbers from 2 to " + n + ": ");
        printEvenNumbers(n);
        System.out.println();
                            }   
        


}