#include<iostream.h>
#include<conio.h>
void main()
{
int c,n;
cin>>n;
int a[n];
for(int i=0;i<n;i++)
{
cin>>a[i];
}
for(int i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
{
c=a[i];
}
}
cout<<c;
getch();
}
