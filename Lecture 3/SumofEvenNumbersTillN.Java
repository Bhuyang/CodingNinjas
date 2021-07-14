
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int d=2;
        while(d<=n){
            sum=sum+d;
            d=d+2;
        }
	System.out.println(sum);
	}

}