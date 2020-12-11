#include <iostream>
using namespace std;

int main() 
{
  int a,b,c;
  cin>>c>>a>>b;
  switch(c)
  {
    case 1:
      cout<<(a+b);
      break;
    case 2:
      cout<<a-b;
      break;
    case 3:
      cout<<a*b;
      break;
    case 4:
      cout<<a/b;
      break;
    default:
      break;
  }
    return 0;
}