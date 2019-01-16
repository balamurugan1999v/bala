#include<iostream.h>
#include<conio.h>
void main()
{
int a,b,x1,x2,y1,y2;
cin>>x1>>x2;
cin>>y1>>y2;
if(x2>y2)
{
a=x1-y1;
b=x2-y2;
}
else
{
a=(x1-1)-y1;
b=(60-x2)+(60-y2);
}
cout<<a<<" "<<b;
getch();
}
