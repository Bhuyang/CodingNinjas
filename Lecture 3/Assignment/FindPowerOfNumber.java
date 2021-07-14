import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int limit = sc.nextInt();
        int result =1;
        
         while(limit>0){
			result = result*num;
			limit--;
		}
		
		System.out.println(result);
        
    }
}