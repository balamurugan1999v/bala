#include <iostream.h>
int main() {
	int res=0,y=0,a,n,d,i;
	cin>>n>>a>>d;
	for(i=0;i<n;i++)
	{
	    a=a+y;
	    res=res+a;
	    y=d;
	}
	cout<<res;
	return 0;
}
