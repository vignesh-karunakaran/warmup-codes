public class Magicsquare {

	public static void main(String[] args) {
	
  //siamese method is used to obtain magic square for only odd values.
  
  int	n=5;
		
    int m[][]= new int[n][n];
		
    //squareing n to fill elements in matrix 
    
    int nsqr=n*n; 

//j is divide by two to fill the starting element in middle of the 1 row matrix
     int i=0,j=n/2;
		
		
		for(int k=1;k<=nsqr;k++) {
			
			m[i][j]=k;
			i--;// i can decremented to minus values in here
			j++;
			
			
			if(k%n==0)
			{
				i+=2;
				j--;
			}
			else
			{
				
        
        while(j==n)
				{
					j-=n;
				}
				
        //if i value is becomes minus value then
        
        while(i<0)
				{
				//i value is added with n value so that the i value will be with in the matrix.	
          
          i+=n;
				}
			
      }
			
			
		//	816
		//  357
		//	492		
			
		}
		//printing the magic square matrix
		    
        for(int s=0;s<n;s++) {
			for(int w=0;w<n;w++) {
				System.out.print(m[s][w]);
			}
			System.out.println();
		}
		
		
		
	}
	
	
}
