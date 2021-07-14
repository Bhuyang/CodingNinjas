import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
        
        int i=1;
        int j=0;
        while(i<=n)
        {        	
        	int k=1;
            while(k<=i)
            {
                System.out.print(j+k);              
                k++;
            }
            j++;
            System.out.println();
            i++;
            
        }
        
		
	}

}
