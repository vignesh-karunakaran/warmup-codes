import java.util.Scanner;

public class GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int st,cr,n;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter starting term");
	   st=sc.nextInt();
	    System.out.println("enter common ratio");
	    cr=sc.nextInt();
	   System.out.println("enter n terms");
	    n=sc.nextInt();
	   for(int i=0;i<n;i++) {
	    	   System.out.print((st)+",");
	    	st*=cr;
	     
	}
	}
}
