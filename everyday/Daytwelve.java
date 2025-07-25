// // import java.util.Scanner;

// // public class Daytwelve 
// // {
// //     public static void main(String[] args)
// //     {
// //         Scanner scanner = new Scanner(System.in);
// //         System.out.println("Enter your input: ");
// //         String input = scanner.nextLine();

// //         String reversedstring = "";
// //         for (int i = input.length() - 1; i >= 0; i--) 
// //         {
// //             reversedstring += input.charAt(i);
// //         }
// //         System.out.println("Reversed string: " + reversedstring);
// //     }        
// // }





// // Day twelve 

// // //  Reverse a string with string builder
// // import java.util.*;
// // public class Daytwelve
// // {
// //     public static void main(String[] args) {
// //         Scanner scanner = new Scanner(System.in);
// //         System.out.println("Enter your input: ");
// //         String input = scanner.nextLine();
// //         StringBuilder reversedString = new StringBuilder(input);
// //         reversedString.reverse();
// //         System.out.println("Reversed string: " + reversedString.toString());
// //         scanner.close();
// //     }
// // }

// /*
// what is a subStrings?
// A substring is a contiguous sequence of characters within a string. For example, in the string "hello", 
// "ell" is a substring. In Java, you can extract a substring using the `substring(int beginIndex, int endIndex)` method of the `String` class. */

// import java.util.*;
// public class Daytwelve
// {
//     //  find all the subStrings of a string using nested loops
//     public static void main(String[] args)
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter your input: ");
//         String input = scanner.nextLine();
//         int length = input.length();
//         System.out.println("Substrings of the input string are: ");
//         for (int i = 0; i < length; i++) 
//         {
//             for (int j = i + 1; j <= length; j++) 
//             {
//                 String substring = input.substring(i, j);
//                 System.out.println(substring);
//             }
//         }
//     }

//     // find all the substring of a string using stringbuilder
//     public static void findSubstringsUsingStringBuilder(String input) {
//         int length = input.length();
//         System.out.println("Substrings of the input string using StringBuilder are: ");
//         for (int i = 0; i < length; i++) {
//             StringBuilder sb = new StringBuilder();
//             for (int j = i; j < length; j++) {
//                 sb.append(input.charAt(j));
//                 System.out.println(sb.toString());
//             }
//         }
//     }
//     // Call the method to find substrings
//     public static void findSubstrings(String input) {
//         findSubstringsUsingStringBuilder(input);
//     }   
// }



