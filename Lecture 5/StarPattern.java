import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int i=1;
        while(i<=n){
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            
            int j=1;
            
            while(j<=i+count){
                System.out.print("*");
                j++;
            }
            count++;
            
            System.out.println();
            i++;
        }
		
	}

}