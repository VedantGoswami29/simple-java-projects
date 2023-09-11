import java.util.Scanner;
class Factorial
{
	static double factorial(int num)
	{
		if(num==0||num==1)	
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
	public static void main(String args[])
	{
		System.out.print("Enter a number to find factorial : ")	;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The factorial of "+number+" is "+factorial(number));
	}
}