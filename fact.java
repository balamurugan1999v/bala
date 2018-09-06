import java.util.*;
class fact
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int a,b=1,i;
a=s.nextInt();
for(i=1;i<=a;i++)
{
b=b*i;
}
System.out.println(b);
}
}
