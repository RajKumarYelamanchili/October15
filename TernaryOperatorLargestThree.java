package interviewprograms3;

public class TernaryOperatorLargestThree {

	public static void main(String[] args) {
		int x=415;
		int y=1500;
		int z=99;
		
		   int largest = (x>y) ? (x>z?x:z) : (y>z ?y:z);
		   
		   System.out.println("largest of 3 numbers " + largest);
		

	}

}
