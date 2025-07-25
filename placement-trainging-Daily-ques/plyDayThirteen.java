/* Day 13 - Revision for the day - 16.07.2025

A chocolate factory produces premium chocolates with custom names printed on their wrappers. Due to a printing machine glitch, some letters are duplicated in the product name. As the quality assurance engineer, your job is to write a program that cleans up the product label by removing duplicate characters (while preserving the original character order).

Write a Java program that reads a product name and returns a version of the name with duplicate characters removed.

Input:

A string productName – the name printed on the chocolate box label (may contain duplicate characters, case-sensitive).

Output:

A string with all duplicate characters removed, keeping only the first occurrence of each character.

Test case 01 :

Input :

chococolate

Output :

choclate

Test case 02 :

Input :

darkchocolate

output :

darkchole */

import java.util.Scanner;

public class plyDayThirteen 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String productName = scanner.nextLine();
        
        StringBuilder cleanedProductName = new StringBuilder();
        boolean[] seen = new boolean[256];    
  
        for (int i = 0; i < productName.length(); i++) 
        {
            char currentChar = productName.charAt(i);
            if (!seen[currentChar]) 
            {
                seen[currentChar] = true;
                cleanedProductName.append(currentChar);
            }
        }
        
        System.out.println("Cleaned product name: " + cleanedProductName.toString());
    

        
        scanner.close();
    }   
}