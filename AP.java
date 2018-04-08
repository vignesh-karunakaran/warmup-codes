import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no,st =1,dif;
		
	Scanner c= new Scanner(System.in);
System.out.println("enter total count numbers");	
no=	c.nextInt();
System.out.println("enter the difference numbers");
dif=c.nextInt();
	int a[]=new int[no];
for(int i=0;i<a.length;i++) {

	System.out.print(st+",");
	st += dif;
}
	
	
	}

}
