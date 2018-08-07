import java.util.*;
class check
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
char l;
l=s.next().charAt(0);
if(((l>='a')&&(l<='z'))||((l>='A')&&(l<='Z')))
{
System.out.println("Alphapet");
}
else
{
System.out.println("NO");
}
}
}
