
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int borrowing = 0;
    
    for (int i = arr1.length - 1, j = arr2.length - 1; i >= 0; i--, j--) {
        int n1 = arr1[i];
        int n2 = 0;
        if (j >= 0) {
            n2 = arr2[j];
        }

        int temp = n1 + n2 + borrowing;
        borrowing = 0; 

        if (temp > 9) {
            borrowing = 1;
            temp -= 10;
        }
        output[i+1] = temp;
    }
    if (borrowing > 0) {
        output[0] = borrowing;
    }
   
    }

}