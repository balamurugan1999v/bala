import java.util.*;
class power
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int a,b,c=1,i,j;
a=s.nextInt();
b=s.nextInt();
j=a;
for(i=1;i<b;i++)
a=a*j;
System.out.println(a);
}
}
