import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    	int sum= 0;
		int count=0;
		while(n!=0){
			int num = n%10;
			sum = sum+(int)Math.pow(2, count)*num;
			count++;
			n=n/10;
		}
		System.out.println(sum);

	}
}
