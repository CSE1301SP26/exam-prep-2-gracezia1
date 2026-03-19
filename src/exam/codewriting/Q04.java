package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q04 {

	/*
	We wish to create a method to create and fill an array of doubles. Complete the fillDoubleArray
	method below by first creating an array of doubles of size n. You should then iterate through the array
	and fill it by reading doubles from the Scanner in parameter. The method should then return the filled
	array.
	 */
	public static double[] fillDoubleArray (int n, Scanner in) {
		double[] finalArray = new double[n];
		int i = 0;
		return fillDoubleArrayHelper(finalArray,in, i); //fix me
	}
	public static double[] fillDoubleArrayHelper(double[] finalArray, Scanner in, int i){
		if (i >= finalArray.length){
			return finalArray;
		}
		finalArray[i] = in.nextDouble();
		return fillDoubleArrayHelper(finalArray, in, i+1);
	}
	/*
	We wish to make a program that draws user-defined polygons. You should first request the user to specify
	how many sides the polygon should have. Then, use the fillDoubleArray method from the previous
	part to create the two necessary arrays before drawing the polygon. The main method has already been
	started for you:
	 */
	public static void main ( String[] args ) {
		Scanner in = new Scanner ( System .in );
		System.out.println("How many sides for the polygon?");
		int sides = in.nextInt();
		System.out.println("Enter X Vertices");
		double[] xVertices = fillDoubleArray(sides, in);
		System.out.println("Enter Y Vertices");
		double[] yVertices = fillDoubleArray(sides, in);
		StdDraw.polygon(xVertices,yVertices);
		//use StdDraw.polygon and fillDoubleArray
	}

}
