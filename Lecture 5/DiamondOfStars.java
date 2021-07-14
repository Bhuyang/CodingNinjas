import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		int count = 0;
		while (i <= n / 2 + 1) {
			int space = 1;
			while (space <= n / 2 - i + 1) {
				System.out.print(" ");
				space++;
			}
			int j = 1;
			while (j <= i + count) {
				System.out.print("*");
				j++;
			}

			count++;

			System.out.println();
			i++;

		}

		i = 1;
		while (i <= n / 2) {
			int space = 1;
			while (space <= i) {
				System.out.print(" ");
				space++;
			}
			int b = 1;
			while (b <= n / 2 + 1 - i) {
				System.out.print("*");
				b++;
			}
			b = 1;
			while (b <= n / 2 - i) {
				System.out.print("*");
				b++;
			}

			System.out.println();
			i++;
		}

        
    }
}