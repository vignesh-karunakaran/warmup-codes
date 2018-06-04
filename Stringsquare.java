
public class Stringsquare {
public static void main(String a[]){

//size of the characters to create is num and k is for assigning characters
int num,d;

	Scanner c= new Scanner(System.in);
	
	System.out.println("enter the number ");
	
	num = c.nextInt();


for(int i=0;i<num;i++) {

	
	for(int j=0;j!=num;j++) {

		//k is assigned here 
	
		int k = i+j;
		
		d = k % num;
		
	
		System.out.print((char)(65+d));
	
	}

	 System.out.println();
}
c.close();
}

}
