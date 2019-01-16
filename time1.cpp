#include <iostream.h>
int main() {
int n,c=0;
cin>>n;
do
{
  if(n>=60)
  {
      c++;
      n=n-60;
  }
}while(n>60);
if(c==0)
{
    cout<<c<<" "<<n;
}
else
cout<<c<<" "<<n;
return 0;
}
