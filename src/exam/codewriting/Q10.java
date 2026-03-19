package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q10 {

	/*
	We wish to create a method to print a string n times all on 
	the same line, where n is a positive integer. For example:

		repeat("hi", 5) would print hihihihihi
		repeat("bye", 3) would print byebyebye

	Complete the method. You may use either iteration or recursion.
	 */
	public static String repeat (String text, int n) {
		if (n == 0){
			return "";
		}
		return text + repeat(text, n-1); //fix me
	}

	public static void main ( String[] args ) {
		System.out.println(repeat("hi", 5));
		System.out.println(repeat("bye", 3));
	}

}
/*public static void repeat(String text, int n) {

    if (n == 0){
        return;
    }

    System.out.print(text);
    repeat(text, n - 1);
} */
