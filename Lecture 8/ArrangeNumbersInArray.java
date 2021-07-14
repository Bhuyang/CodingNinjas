
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int emptyArr[] = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
           emptyArr[i]=i+1;
        }
       for(int i=0;i<n;i++){
            if(emptyArr[i]%2!=0){
                arr[count]=emptyArr[i];
                count++;
            }
        }    
        count=n-1;
        for(int i=0;i<n;i++){
            if(emptyArr[i]%2==0){
                arr[count]=emptyArr[i];
                count--;
            }
        }
    }
}