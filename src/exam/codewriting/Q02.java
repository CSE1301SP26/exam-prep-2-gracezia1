package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q02 {

	/**
	* Draw a dashed line from (x,0) to (x,1)
	* on a standard StdDraw canvas. The length of the
	* dashes and the space between the dashes should
	* both be 0.02.
	* @param x is the x coordinate for the dashed line
	*
	**/
	public static void dashedLine(double x) {
		dashedLineHelper(x, 0.02);
	}
	public static void dashedLineHelper(double x, double space){
		if (space>=1){
			return;
		}
		StdDraw.line(x, 0 + space, x, 0.02+space);
		dashedLineHelper(x, space + 0.04);
	}
	public static void main(String[] args) {
		dashedLine(0.25);
	}

}
