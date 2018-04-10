import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//no is how manynumbers to print,st is starting point ,dif is difference.
		
		int no,st,dif;
		
	Scanner c= new Scanner(System.in);
		
	System.out.println("enter starting point");
	
		st = c.nextInt();
	
		System.out.println("enter total count numbers");	
	
		no=c.nextInt();
	
		System.out.println("enter the difference numbers");
	
		dif=c.nextInt();
//using for loop to print till how many numbers to print.	
	for(int i=0;i<no;i++) {

	//printing the starting value before adding difference.
		System.out.print(st+",");
	//difference is added to starting point till for loop condition exists
		st += dif;
	}
	
	c.close();
	
	
	}

}
