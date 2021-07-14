import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m=0;
        int sum =0;
        
        for(int i=1;i<=n+m;i++){
            sum= ((3*i)+2);
            if(sum%4!=0){
                System.out.print(sum+" ");
            }else{
                m++;
            }
            
        }

	}
}