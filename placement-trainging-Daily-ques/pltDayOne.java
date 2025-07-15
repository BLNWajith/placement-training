/* Day 01 - Problem Solving for the day - 02.07.2025 

Given two integers M and N, calculate the product  of all odd integers from M and N inclusive.if M is greater than N , return 1 or display an appropriate message

Test Case 1: M = 3, N =7  

Test Case 02 : M = 2, N = 5

Test Case 03 : M = 10, N = 6 */


public class pltDayOne {
    public static void main(String[] args) {
        int M = 3, N = 7; // Test Case 1
        
        // int M = 2, N = 5; // Test Case 2
        
        // int M = 10, N = 6; // Test Case 3
        
        if (M > N) {
            System.out.println("M should not be greater than N. Returning 1.");
            System.out.println("Product: " + 1);
            return;
        }

        int product = 1;
        for (int i = M; i <= N; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        
        System.out.println("Product of all odd integers from " + M + " to " + N + ": " + product);
    }
    
}
