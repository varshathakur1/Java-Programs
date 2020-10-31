
public class BetterRecursionFibonacci {

	//To see how many times the recursion is executed
	private int counter=0;	
	private int fibonacci(int n) {
		return fibonacciHelper (1,0,n);
	}
	/*
	 * fibCurrent: current fibonacci number
	 * fibPrevious: previous fibonacci number
	 * n: the count of fibonacci numbers left to calculate
	 * return: The value of the fibonacci numbers calculated so far
	 */
	private int fibonacciHelper (int fibCurrent, int fibPrevious, int n) {
		counter ++;
		if (n==1) 
			return fibCurrent;
			else 
				return fibonacciHelper ( fibCurrent+ fibPrevious, fibCurrent,  n-1);
	}
	

	public static void main(String[] args) {
		BetterRecursionFibonacci r = new BetterRecursionFibonacci();
		System.out.println (r.fibonacci(17));
		System.out.println (r.counter);
		

	}

}

