import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        for(int i=2;i<=n;i++){
           boolean isPrime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(i);
            }
        }
	}
}