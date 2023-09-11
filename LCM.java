import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		System.out.println("This is a java program to find L.C.M. of 2 numbers." );
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		int maxNum = Math.max(num1,num2);
		while(true)
		{
			if(maxNum%num1==0&&maxNum%num2==0)
			{
				break;
			}
			maxNum++;
		}
		System.out.println("The L.C.M. of " + 
		                   num1 + " and " + 
		                          num2+" is equals to " + 
		                               maxNum);
			
	}
}