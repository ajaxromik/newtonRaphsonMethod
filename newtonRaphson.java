/**
 * A program using the Newton-Raphson method to get a solution to its 
 * sixth decimal.
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
		
//		//starting point
//		double ans = 1;
//		System.out.println(ans);
//		
//		//points that newton-raphson method leads to
//		for(int i = 0; i < 7; i++) {
//			ans = newtonRaphsonMethod(ans, oneA(ans), oneAPrime(ans));
//			System.out.println(ans);
//		}
		
		double startPt = 2;
		int approximations = 3;
		
		thirdNewtonRaphsonMethod(startPt, approximations);
		
		// TLDR: all the methods work exactly the same and I should have started on github
//		double first = firstNewtonRaphsonMethod(startPt, function(startPt), derivative(startPt), approximations);
//		double second = secondNewtonRaphsonMethod(startPt,  approximations);
//		double third = thirdNewtonRaphsonMethod(startPt, approximations);
//		System.out.println(first == second);
//		System.out.println(second == third);
		
	}
	
	/**
	 * Uses the Newton-Raphson method to find an estimated value. 
	 * Side Note: I tried making it recursive first before realizing it would be easier to read a simple for loop version.
	 * Question: Is it bad to use xN in the loop? I notice that normally in code that I have seen,
	 * programmers avoid modifying the parameters like that.
	 * 
	 * @param xN The x sub 1 to be used for this equation.
	 * @param approximation The highest level of approximation to attempt. Must be >= 1.
	 * @return The base value after doing the method a certain number(<iterations>) of times
	 */
	public static double thirdNewtonRaphsonMethod(double xN, int approximation) { //most shortened version, but I'm not sure if this is something that CS people avoid on purpose
		for(int i = 0; i < approximation; i++) {
			xN = xN - function(xN)/derivative(xN);
			System.out.println(xN);
		}
		
		return xN;
	}
	
//	public static double secondNewtonRaphsonMethod(double xN, int approximation) {
//		//takes the first iteration of the method
//		double x = xN - function(xN)/derivative(xN);
//		System.out.println(x);
//		
//		for(int i = 1; i < approximation; i++) { // starts at i = 1; because the first approximation was already completed
//			x = x - function(x)/derivative(x);
//			System.out.println(x);
//		}
//		
//		return x;
//	}
//	
//	public static double firstNewtonRaphsonMethod(double xN, double f, double fPrime, int iterations) {
//		double x = xN - f/fPrime;
//		System.out.println(x); //comment this line if you do not want to see every x sub n in the whole process
//		
//		//recursion stops when we have reached the last iteration that we are attempting for
//		if(iterations == 1) {
//			return x;
//		}
//		//runs the next iteration
//		return firstNewtonRaphsonMethod(x, function(x), derivative(x), iterations-1);
//	}
	
	
	/**
	 * Formula for original function
	 * 
	 * @param x Any x in the domain of f(x)
	 * @return f(x)
	 */
	public static double function(double x) {
		return Math.pow(x, 3) - 2 * x - 5;
	}
	
	/**
	 * Formula for the derivative of the function
	 * 
	 * @param x Any x in the domain of f(x)
	 * @return f'(x)
	 */
	public static double derivative(double x) {
		return 3 * Math.pow(x, 2) - 2;
	}
	
}
