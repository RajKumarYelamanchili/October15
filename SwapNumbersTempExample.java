package interviewprograms3;

public class SwapNumbersTempExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
	
		System.out.println("before swapping");
		System.out.println("a= " + a + "     "+ "b= "+ b);
		int temp =a;
		        a =b;
		        b = temp;
		        
	  System.out.println("After swapping");
	  System.out.println("a= " + a + "     "+ "b= "+ b);

	}

}
