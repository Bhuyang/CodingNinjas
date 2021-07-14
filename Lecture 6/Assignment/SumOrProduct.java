import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
        int sum=0;
        int product=1;
        
        for (int i = 1; i <= n; i++) {

			if (c == 1) {
				sum = sum + i;
			} else if (c == 2) {
				product = product * i;
			} else {
				System.out.println(-1);
				break;
			}
		}
		if(c==1){
			System.out.println(sum);
		}else if(c==2){
			System.out.println(product);
		}
        
        
	}
}