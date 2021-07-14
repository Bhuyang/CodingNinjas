public class Solution {

    public static int linearSearch(int arr[], int x) {
		int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
            	index=i;
            } 
        }
        return index;
    }
}