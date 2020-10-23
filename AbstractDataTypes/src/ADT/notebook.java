package ADT;

public class notebook extends computer {
	
	double weight;
	
	notebook (double ram, double disk, double weight) {
		super (ram,disk);
		this.weight = weight;
	}
	
	@Override 
	public String toString () {
		return super.toString() + ", and the weight is: " + weight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer n1 = new notebook (1024, 2, 3.4);
		System.out.println (n1.toString ());

	}

}
