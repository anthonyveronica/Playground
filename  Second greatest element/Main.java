#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,temp;
  cin>>n;
  int arr[n];
    int largest=0,second_largest=0;
  int pos1,i,pos2;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr[i]>arr[j])
      {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
  }

  if(n>2)
  {
for (i = 0; i<n; ++i)
       {
              if (arr[i]>largest)
              {
                     largest = arr[i];
                     pos1 = i;
              }
       }
       for (i = 0; i<n; ++i)
       {
              if (arr[i]>second_largest)
              {
                     if (arr[i] == largest)
                           continue;  
                     second_largest = arr[i];
                     pos2 = i;
              }
       }
    if(second_largest==0)
    {
      cout<<"There is no second largest element";
    }
    else
    {
    cout<<second_largest;
    }
  }
  else if(n<2)
  {
    cout<<"Invalid Input";
  }
  else if(n==2)
  {
    if(arr[0]==arr[1])
    {
      cout<<"There is no second largest element";
    }
    else
    {
     cout<<arr[1];
    } 
  }
    return 0;
}