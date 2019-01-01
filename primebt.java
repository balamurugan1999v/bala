import java.util.*;
class primebt
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int a,b,i,j=0,m;
a=s.nextInt();
b=s.nextInt();
for(m=a+1;m<b;m++)
{
for(i=1;i<=m;i++)
{
if((m%i)==0)
j++;
}
if(j==2)
System.out.print(m+" ");
}
}
}
