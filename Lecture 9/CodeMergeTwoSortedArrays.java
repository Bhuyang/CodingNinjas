public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	int i=0;
		int j=0;
		int k=0;
		int arr3[] = new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr3[k] = arr1[i];
				k++;
				i++;
			}else{
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length){
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length){
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		return arr3;
		   
    }

}