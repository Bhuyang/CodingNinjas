import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        int allow = 0;
        int totalSalary=0;
        
        if(grade=='A'){
            allow=1700;
        }else if(grade=='B'){
            allow=1500;
        }else{
            allow=1300;
        }
        
       float hra= ((float)basic*20)/100;
       float da = ((float)basic*50)/100;
       float pf = ((float)basic*11)/100; 
        
		totalSalary = (int)Math.round((basic+hra+da+allow)-pf);
        
        System.out.println(totalSalary);   
        
	}
}
