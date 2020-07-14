// Code reviewed by @professorgordon
package jaiBWeek4Assign;
import java.util.Scanner;



public class JaiBWeek4Assignment {

	public static void main(String[] args) {
		// Jai Breisch 1400 Week 4 Box Surface area and Volume Solver
		
		double L = 0;
		double W = 0;
		double H = 0;
		
		System.out.println("Please Measure the Length, Width, and Height of your Box \nso we can calculate the Surface Area and Volume of your box ");

	Scanner input = new	Scanner(System.in);
	System.out.printf("Please enter the Length: ", L);
	L = input.nextDouble();
	
	System.out.printf("Please enter the Width: ", W);
	W = input.nextDouble();
	
	System.out.printf("Please enter the Height: ", H);
	H = input.nextDouble();
	double SA = (2*L*W+2*L*H+2*H*W);
	
	System.out.printf("Your Surface Area is : %,.2f%n",+ SurfaceArea(L, W, H));
	System.out.printf("Your Volume is : %,.2f%n", +Volume(L,W,H));
	}
	private static double SurfaceArea (double W, double L, double H) {
		return (2*L*W+2*W*H+2*H*L);
	}
	private static double Volume (double W, double L, double H) {
		return (L*W*H);
	}
	//battabingbattaboombattadone!
	//Fixed it using methods vs single use computations
	}
