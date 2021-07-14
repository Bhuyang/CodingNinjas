import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans= 0;
		long pow=1;
		while(n>0){
			long num = n%2;
			n= n/2;
			ans=ans+num*pow;
			pow=pow*10;
			
		}
		System.out.println(ans);

	}
}
