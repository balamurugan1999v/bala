import java.util.*;
class prime
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int a,b,i,j=0;
a=s.nextInt();
for(i=1;i<=a;i++)
{
if((a%i)==0)
j++;
}
if(j==2)
System.out.print("yes");
else
System.out.print("no");
}
}
