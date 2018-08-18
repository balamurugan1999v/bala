#include<iostream.h>
#include<conio.h>
void main()
{
int a[50],i,k,n,c=0;
cin>>n;
for(i=0;i<n;i++)
{
cin>>a[i];
}
cin>>k;
for(i=0;i<k;i++)
c=c+a[i];
cout<<c;
getch();
}
