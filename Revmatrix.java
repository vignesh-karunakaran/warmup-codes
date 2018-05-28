class Revmatrix{


public static void main(String v[]){


int k=0;
int t=1;
int n=4;

for(int i=0;i<n;i++)
{

for(int j=0;j<n;j++)
{
k+=t;
System.out.print(k);
}
k=k+n+t;
t=-t;
System.out.println();
}


}


}
