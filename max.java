import java.util.*;
class max
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int l,m,n;
l=s.nextInt();
m=s.nextInt();
n=s.nextInt();
if((l>m)&&(l>n))
{
System.out.println(l);
}
else if((l<m)&&(m>n))
{
System.out.println(m);
}
else
{
System.out.println(n);
}
}
}
