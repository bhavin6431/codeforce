#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
    ios::sync_with_stdio(0);cin.tie(0);
    mt19937 rng((unsigned int) chrono::steady_clock::now().time_since_epoch().count());
    auto start=chrono::high_resolution_clock::now();
    
    //code here
    
    int n, q;
    cin>>n>>q;
    string s;
    cin>>s;
    int cnt=0;
    for(int i=0;i<n;i++)
    {
    	if(s[i]=='a')
    	{
    		if(i<=n-3 && s[i+1]=='b' && s[i+2]=='c')
    			cnt++;
    	}
    }
    while(q--)
    {
    	int pos;
    	cin>>pos;
    	char c;
    	cin>>c;
    	pos--;
    	if(s[pos]==c)
    	{
    		cout<<cnt<<endl;
    	}
    	else
    	{
    		int fl=0;
    		if(s[pos]=='a')
    		{
    			if(pos<=n-3 && s[pos+1]=='b' && s[pos+2]=='c')
    			{
    				fl=1;
    			}
    		}
    		else if(s[pos]=='b')
    		{
    			if(pos<=n-2 && pos>=1 && s[pos-1]=='a' && s[pos+1]=='c')
    			{
    				fl=1;
    			}
    		}
    		else
    		{
    			if(pos>=2 && s[pos-1]=='b' && s[pos-2]=='a')
    			{
    				fl=1;
    			}
    		}
    		if(fl==1)
    		{
    			// s[pos]=c;
    			cnt--;
    		}
    		// else
    		// {
    			int fl1=0;
    			if(c=='a')
    			{
    				if(pos<=n-3 && s[pos+1]=='b' && s[pos+2]=='c')
	    			{
	    				fl1=1;
	    			}
    			}
    			else if(c=='b')
    			{
    				if(pos<=n-2 && pos>=1 && s[pos-1]=='a' && s[pos+1]=='c')
	    			{
	    				fl1=1;
	    			}
    			}
    			else
    			{
    				if(pos>=2 && s[pos-1]=='b' && s[pos-2]=='a')
	    			{
	    				fl1=1;
	    			}
    			}
    			s[pos]=c;
    			if(fl1==1)
    			{
    				cnt++;
    			}
    		// }
    		cout<<cnt<<endl;
    	}
    }

    auto stop=chrono::high_resolution_clock::now();
    auto duration=chrono::duration_cast<chrono::microseconds>(stop-start);
    cerr<<duration.count()/1000.0<<" ms\n";
}