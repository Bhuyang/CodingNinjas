import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        int i=1;
        while(i<=n){
            int space =1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            
            int start=1;
            int j=i;
            while(start<=i){
                System.out.print(j);
                j++;
                start++;
            }
            
           	int p=1;
            while(p<=i-1){
                System.out.print(j-2);
                j--;
                p++;
            }
            
            System.out.println();
            i++;
        }
	}
}