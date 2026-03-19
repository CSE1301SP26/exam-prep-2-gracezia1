package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength ) {
		//your code here
		if (halfLength <= 0.001){
			return;
		}
		StdDraw.filledSquare(xCtr, yCtr, halfLength / 3);
		recursiveCarpet(xCtr - halfLength/3 *2, yCtr - halfLength/3 *2, halfLength /3);
		recursiveCarpet(xCtr + halfLength/3 *2, yCtr - halfLength/3 *2, halfLength /3);
		recursiveCarpet(xCtr + halfLength/3 *2, yCtr + halfLength/3 *2, halfLength /3 );
		recursiveCarpet(xCtr - halfLength/3 *2, yCtr + halfLength/3 *2, halfLength /3);
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.25 ;
		recursiveCarpet ( 0.5 , 0.5 , halfCarpetLength ) ;
	}

}
