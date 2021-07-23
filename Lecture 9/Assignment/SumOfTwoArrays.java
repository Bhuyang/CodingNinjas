
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	 int i= arr1.length-1;
        int j= arr2.length-1;
        int k= output.length-1;
        int carry=0;
        while(k>=0){
            int sum=carry;
            if(i>=0){
                sum=sum+arr1[i];
            }
            if(j>=0){
                sum=sum+arr2[j];
            }
            
            int val = sum%10;
            carry = sum/10;
            output[k]=val;
            i--;
            j--;
            k--;      
        }
   
    }

}