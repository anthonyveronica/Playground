#include<stdio.h>
int main()
{
    int n1,n2,count1=0,count=0,temp1,temp2;
    scanf("%d%d",&n1,&n2);
    while(n1!=0 || n2!=0)
    {
        temp1 = n1%10;
        temp2 = n2%10;
        if(temp1+temp2+count>=10)
        {
            count1++;
            count=1;
        }
        else
        {
            count = 0;
        }
        n1 = n1/10;
        n2 = n2/10;
    }
    printf("%d",count1);
}