#include <bits/stdc++.h>
using namespace std;
int dist[100005];
int vis[100005];
vector< pair<int,int> > v[100005];

void dijkstra()
	{
	multiset< pair< int,int > > s;
	s.insert({0,1});
	while(!s.empty())
		{
		pair< int,int > p = *s.begin();
		s.erase(s.begin());
		int e = p.second;
		if(vis[e])
			continue;
			vis[e]=1;
				for(int i=0;i<v[e].size();i++)
				{
					int U = v[e][i].first;
					int V = v[e][i].second;
					if(dist[e]+V<dist[U])
						{
						dist[U] = dist[e]+V;
						s.insert({dist[U],U});
						}
				}
	}
	}
int main()
{
	int E,N,U,V,T;
	cin>>N>>E;
	for(int i=0;i<=N+3;i++)
		{
		dist[i]=1e9;
		vis[i]=0;
		}
	dist[0]=0;
	dist[1]=0;
	for(int i=0;i<E;i++)
		{
		cin>>U>>V>>T;
		v[U].push_back(make_pair(V,T));
		}
	dijkstra();
	for(int i=2;i<=N;i++)
		{
		cout<<dist[i]<<" ";
		}
	return 0;
}

/*
3 2
1 2 6
2 3 4
1
3


10
4
0
*/
