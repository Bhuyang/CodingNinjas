public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
        int nz = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                int temp = arr[nz];
                arr[nz] = arr[i];
                arr[i] = temp;
                nz++;
            }
        }
    }
}