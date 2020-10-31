
public class RecursionFibonacci {
	//To see how many times the recursion is executed
	private int counter=0;	
	private int fibonacci(int n) {
		counter ++;
		if (n<0) {
			System.out.println ("invalid input");
		return -1;
	}
	
		if (n<=2)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
	}

	public static void main(String[] args) {
		RecursionFibonacci r = new RecursionFibonacci();
		System.out.println (r.fibonacci(17));
		System.out.println (r.counter);
		

	}

}
