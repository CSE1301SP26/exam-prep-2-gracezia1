package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q12 {

	public static void rDraw ( double xCtr , double yCtr , double size ) {
		if (size<0.01){
			return;//your code here
	}
	if (size<0.25/4){
		StdDraw.circle(xCtr + size, yCtr - size, size/2);
		StdDraw.circle(xCtr - size, yCtr + size, size/2);
	}
		StdDraw.square(xCtr, yCtr, size);
		rDraw(xCtr + size, yCtr - size, size/2);
		rDraw(xCtr - size, yCtr + size, size/2);}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion

		rDraw (0.5 , 0.5 , 0.25);
	}

}
