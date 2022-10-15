package interviewprograms3;

public class SwapNumbersWithoutTempExample {

	public static void main(String[] args) {
		int a=5;
		int b=7;
	
		System.out.println("before swapping");
		System.out.println("a= " + a + "     "+ "b= "+ b);
		
		 /* a= a+b;
		   b =a-b;
		    a =a-b;*/
		
		a =a*b;
		 b=a/b;
		 a=a/b;
		   
		System.out.println("before swapping");
		System.out.println("a= " + a + "     "+ "b= "+ b);

	}

}
