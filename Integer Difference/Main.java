num=int(input())
arr=list(input().strip().split(" "))
n,m=list(input().strip().split(" "))
n=int(n)
m=int(m)
arr = [int(i) for i in arr]
for i in range(0,len(arr)):
  if (arr[i]-n)<m:
    arr[i]=arr[i]+1
for i in range(0,len(arr)):
  print(arr[i],end=" ")