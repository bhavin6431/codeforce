#include <bits/stdc++.h>
#define ll long long int
using namespace std;
 
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	ll n,m;
	cin>>n>>m;
	char arr[n][m];
	for(ll i=0;i<n;i++)
		for(ll j=0;j<m;j++)
			cin>>arr[i][j];
	ll presum[m];
	presum[0]=0;
	ll count=0;
	for(ll j=1;j<m;j++)
	{
		for(ll i=1;i<n;i++)
		{
			if(arr[i][j-1]=='X' && arr[i-1][j]=='X')
				count++;
		}
		presum[j]=count;
	}
	ll q;
	cin>>q;
	while(q--)
	{
		ll x1,x2;
		cin>>x1>>x2;
		if(presum[x2-1]-presum[x1-1]==0)
			cout<<"YES\n";
		else 
			cout<<"NO\n";	
	}
	return 0;
}