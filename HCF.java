import java.util.Scanner;
public class HCF {
	public static void main(String[] args) {
		System.out.println("This is a java program to find H.C.F. of 2 numbers." );
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		int minNum = Math.min(num1,num2);
		int hcf = 1;
		for(int i=1;i<(minNum+1);i++)
		{
			if(num2%i==0&&num1%i==0)
			{
				hcf = i;
			}
		}
		System.out.println("The H.C.F. of " + num1+" and " + num2+" is " + hcf);			
	}
}