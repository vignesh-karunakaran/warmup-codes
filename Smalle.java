import java.util.Scanner;

public class Smalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//num is number ,l is off of the number 	
    
    int num,l,b;
		String k="";    
        Scanner v= new Scanner(System.in);
	
           num =v.nextInt();
		
             l=num/2;
		
		
       for(int i=0;i<num;i++) {
			
                 b=i%l;
			
                  b++;
		
			
			System.out.print(k+b);
	 //initalizing k after first number printed.     
	       k=",";
       }
		
	}

}
