n=int(input())
arr=list(input().strip().split(" "))
for i in range(0,len(arr)):
  arr[i]=int(arr[i])
arr.sort()
for i in range(0,len(arr)):
  print(arr[i],end=" ")