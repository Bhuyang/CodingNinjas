public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		
        
        for(int i=start;i<=end;i+=step){
             int s= (5*(i-32))/9;
            System.out.println(i+" "+s);
        	}  	
	}
}