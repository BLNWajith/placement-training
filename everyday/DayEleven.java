
import java.util.Scanner;

public class DayEleven 
{


    //  1. Input a string from the user and print it
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String input = scanner.nextLine();
        System.out.println("print the string you enetered: " + input);
        
        // 2. length of the string
        System.out.println(" Length of the string: " + input.length()); 
    
        // 3. Convert String to uppercase
        System.out.println("String in uppercase: " + input.toUpperCase());
        // 4. Convert String to Character
        char[] characters = input.toCharArray();
        System.out.print("String to character array: ");
        for (char c : characters) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // 5. String to lowercase without using toLowerCase()
        StringBuilder lowerCaseString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') 
            {
                c = (char) (c + 32);
            }
            lowerCaseString.append(c);
        }
        System.out.println("String in lowercase without using toLowerCase(): " + lowerCaseString.toString());



        // 6. Remove all the special characters in the string

        String cleanedString = input.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println("String after removing special characters: " + cleanedString);


        // 7. Remove all the vowels in the string
        String noVowelsString = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowels: " + noVowelsString);

        // 7. remove all the vowels in the string without using inbuilt methods
        if (input.length() > 0) {
            String noVowelsWithoutInbuilt = new String();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                      c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) 
                      {
                    noVowelsWithoutInbuilt += c;
                }
            }
            System.out.println("String after removing vowels without using inbuilt methods: " + noVowelsWithoutInbuilt.toString());
        } 
        else 
        {
            System.out.println("The string is empty, no vowels to remove.");
        }

        // 8. Reverse the string

        



        scanner.close();


        
    }


}
