import java.util.Scanner;
public class ManyHCF {
	static int min(int[] num) {
		int minNum = num[0];
		for (int i : num) {
			if (i < minNum) {
				minNum = i;
			}
		}
		return minNum;
	}
	static int hcf(int[] num) {
		int minNum = min(num);
		for (int i = minNum;i>1;i--) {
			boolean find = true;
			for (int n : num) {
				if (n % i  != 0) {
					find = false;
					break;
				}
			}
			if (find) {
				return i;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of H.C.F. you want to find : ");
		int limit = sc.nextInt();
		int[] numbers = new int[limit];
		for (int i = 0; i < limit; i++) {
			System.out.print("Enter " + (i + 1) + " number : ");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int ans = hcf(numbers);
		System.out.println("The H.C.F. of " + limit + " number is : " + ans);
	}
}