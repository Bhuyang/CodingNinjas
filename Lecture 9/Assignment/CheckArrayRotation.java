public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	int min=Integer.MAX_VALUE;
        if(arr.length==0){
            return 0;
        }
        
		int minIndex=Integer.MAX_VALUE;
		for(int  i=0;i<arr.length;i++) {
			if(arr[i] < min) {
			min=arr[i];
			minIndex=i;
			}
		}
		return minIndex;
    }

}