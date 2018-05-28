class Intreverse{

public static void main(String s[]){

int a=12345;
int n=3;
int count=0;
int tmp=1,t1=1;
int k=1;
int v=a;
for(int i=0;i<=v;i++)
{
count++;
v/=10;
tmp*=10;
}
for(int j=0;j<=count-n;j++)
{
t1*=10;
}
tmp=tmp*10/t1;
k=a%t1;
k=k*tmp+(a/t1);
System.out.println(k);

}

}
