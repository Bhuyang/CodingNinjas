public class Solution {
	
	public static boolean checkMember(int n){
		int a=0;
        int b=1;
        int c=0;
        boolean result = false;
        if(n==0){
            return true;
        }
        for(int i=0;i<n+1;i++){
            c=a+b;
            a=b;
            b=c;
            if(c==n){
                result=true;
                break;
            }
        }
			return result;
	}
	

}