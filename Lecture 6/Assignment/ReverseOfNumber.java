import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int a,res=0;	
		while(n!=0)
		{
		a=n%10;
		res=(res*10)+a;
		n=n/10;
		}
		System.out.println(res);
    

	}
}