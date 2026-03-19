package nonexam.fibonacci;

public class Fibonacci {

	/*
	 * Instructions for this extension can be found here:
	 * 
	 * https://131text.com/ns/books/published/csjava/Extensions/6.04.html
	 */

	public static int recursive(int n) {
		int first = 1;
		int second = 1;
		int count = 1;
			return recursiveHelper(n, first, second, count); // FIXME
		
	}
	public static int recursiveHelper(int n, int first, int second, int count){
		if (count == n){
			return first;
		}
		return recursiveHelper(n, second, first + second, count+1);

	}

	/**
	 * Below write your solution to Fibonacci, using iteration
	 * 
	 * @param n
	 * @return the nth Fibonacci number, computed iteratively
	 */
	public static int iterative(int n) {
		
			return 0; // FIXME
		
	}

}
