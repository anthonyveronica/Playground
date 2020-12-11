#include <iostream>
using namespace std;

int main() 
{
   int n,sum=0;
  cin>>n;
  for(int i=1;i<=10;i++)
  {
    cout<<n*i<<" ";
    sum+=(n*i);
  }
  cout<<"\n"<<sum;
    return 0;
}