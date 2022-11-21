/**
 * A program using the Newton-Raphson method to approximate a solution.
 * 
 * @author William Carr
 * @version 11.21.2022
 */
public class newtonRaphson {
	
	/**
	 * The main() function to run the other functions.
	 * 
	 * @param args 
	 */
	public static void main(String[] args) {
		
		double startPt = 1; //x sub 1 for our purposes
		int approximations = 10; //how many approximations do we attempt?
		
		System.out.println("x sub 1:\t" + startPt);
		thirdNewtonRaphsonMethod(startPt, approximations);
		
	}
	
	/**
	 * Uses the Newton-Raphson method to find an estimated value.
	 * 
	 * @param xN The x sub 1 to be used for this equation.
	 * @param approximation The highest level of approximation to attempt. Must be >= 1.
	 * @return The base value after doing the method a certain number(<iterations>) of times
	 */
	public static double thirdNewtonRaphsonMethod(double xN, int approximation) {
		for(int i = 1; i < approximation; i++) { // xN is x sub 1, so we skip the first index
			xN = xN - function(xN)/derivative(xN);
			System.out.println("x sub " + (i+1) + ":\t" + xN);
		}
		
		return xN;
	}
	
	/**
	 * Formula for original function. Must exist at x.
	 * 
	 * @param x Any x in the domain of f(x).
	 * @return f(x)
	 */
	public static double function(double x) {
		return Math.cos(x) - x;
	}
	
	/**
	 * Formula for the derivative of the function. Must be differentiable at x.
	 * 
	 * @param x Any x in the domain of f(x) and f'(x).
	 * @return f'(x)
	 */
	public static double derivative(double x) {
		return -1 * Math.sin(x) - 1;
	}
	
}
