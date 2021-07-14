import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int evenSum =0;
        int oddSum =0;
        
        
        while(n>0){
            long rem = n%10;
            if(rem%2==0){
               evenSum= evenSum+(int)rem; 
            }else{
                oddSum= oddSum+(int)rem; 
            }
            n=n/10;
        }
			System.out.println(evenSum+" "+oddSum);
	}
}
