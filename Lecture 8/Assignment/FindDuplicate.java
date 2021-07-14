public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] == arr[j] && i!=j) {
					num=arr[i];
					break;
				}
			}

		}
		return num;
    }
}