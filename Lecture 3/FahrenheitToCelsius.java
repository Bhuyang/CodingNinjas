import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();  
        int result=0;
		 while(s<=e){
			 result = (5*(s-32))/9;
			 System.out.println(s+" "+result);
			 s=s+w;
		 }
		
		
	}

}
