package fibonacci;

/**
 * This class contains methods for calculating Fibonacci numbers.
 *
 */

public class Fibonacci {
	
	/**
	 * Calculates the nth term of the Fibonacci sequence.
	 * 
	 * @param n The position in the Fibonacci sequence (positive integer or 0).
	 * @return The nth term of the Fibonacci sequence.
	 * @throws IllegalArgumentException if n is not positive integer or 0. 
	 */
	
	public static int calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }	else if  (n == 0) {
        	return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

	/**
	 * Main method that calls the calculateFibonacci method and outputs the result.
	 * 
	 * @param args The command-line arguments
	 */
	
    public static void main(String[] args) {
        int n = 10;
        int result = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }

}
