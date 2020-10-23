package ADT;

public class computer {
	
	private double ramSize;
	private double diskSize;
	
	computer (double ram, double disk) {
		ramSize = ram;
		diskSize = disk;
	}
	
	computer (double ram){
		ramSize = ram;
	}

	public String toString ()  {
		return "The ram size is: " + ramSize + ", and the disk size is: " + diskSize;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
