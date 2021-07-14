public class Solution{  

    public static int findUnique(int[] arr){
		
        int num=0;
        for(int i=0;i<arr.length;i++){
            boolean same = false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]==arr[j] && i!=j){
                    same=true;
                    break;
                }
            }
            if(!same){
                num=arr[i];
                break;
            }
          
        }
        return num;
    }
}