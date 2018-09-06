import java.util.*;
class eve
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int a,b,i;
a=s.nextInt();
b=s.nextInt();
for(i=a+1;i<b;i++)
{
if((i%2)==0)
{
System.out.println(i);
}
}
}
}
