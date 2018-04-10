
public class Stringsquare {
public static void main(String a[]){

//size of the characters to create is num and k is for assigning characters
int num,k;

	Scanner c= new Scanner(System.in);
	
	System.out.println("enter the number ");
	
	num = c.nextInt();


for(int i=0;i<num;i++) {

	
	for(int j=0;j!=num;j++) {
//k is assigned here 
	k = i+j;

		while(k<num){
//if the k below num it will print the character for the assigned k value which is added with the ascii integer value from A-65
	System.out.print((char)(65+k));
	break;
	
		}
//if the k is greater than or equal to num this while loop is executed
	while(k>=num)
	{
//k value is subtracted to num value eg:- if k=3 then(3-3) those k value is assigned zero,if k=4 then (4-3) then k is assigned to 1 and so on...
	
	k -=num;
	
	System.out.print((char)(65+k));
	
	}
	

	
	}

	 System.out.println();
}
}

}
