#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
char a[15],b[15]="saturday",c[15]="sunday";
cin>>a;
if((strcmp(a,b)==0)||(strcmp(a,c)==0))
{
cout<<"yes";
}
else
{
cout<<"no";
}
getch();
}
