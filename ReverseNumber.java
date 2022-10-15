package interviewprograms3;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number which you want to reverse: ");
		int num = sc.nextInt();
		int originalNum=num;
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;  //%10 --last digit
			 num  = num/10;       //  /10  --except last digit
			
		}
		System.out.println("reverse of number: " + rev);
		
		if (originalNum==rev)
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}
	}

}
