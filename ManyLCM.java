import java.util.Scanner;
public class ManyLCM {
	static int max(int[] num) {
		int maxNum = num[0];
		for (int i : num) {
			if (i > maxNum) {
				maxNum = i;
			}
		}
		return maxNum;
	}
	static int lcm(int[] num) {
		int maxNum = max(num);
		while (true) {
			boolean find = true;
			for (int n : num) {
				if (maxNum % n != 0) {
					find = false;
					break;
				}
			}
			if (find) {
				break;
			}
			maxNum++;
		}
		return maxNum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number of L.C.M. you want to find : ");
		int limit = sc.nextInt();
		int[] numbers = new int[limit];
		for (int i = 0; i < limit; i++) {
			System.out.print("Enter " + (i + 1) + " number : ");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int ans = lcm(numbers);
		System.out.println("The L.C.M. of " + limit + " number is : " + ans);
	}
}