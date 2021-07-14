public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	int secondLargest=Integer.MIN_VALUE;
        if(arr.length==0){
            return secondLargest;
        }
        
        int max=arr[0];
		
        
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i] ) {
				secondLargest=max;
				max=arr[i];
			}
			if(arr[i] <max && arr[i] >secondLargest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
    }

}