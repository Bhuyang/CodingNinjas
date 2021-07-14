
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int low =0;
        int high = arr.length-1;
    
       
        
        while(low<=high){
		int mid = low + (high - low) / 2;
    	  if (arr[mid] == x)
        	return mid;
      if (arr[mid] < x)
        low = mid + 1;
      else
        high = mid - 1;
    }
        return -1;
    }
}