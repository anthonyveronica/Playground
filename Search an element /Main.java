n=int(input())
arr=list(input().strip().split(" "))
for i in range(0,len(arr)):
  arr[i]=int(arr[i])
x=int(input())
try:
  ind=arr.index(x)
  print("index =",ind)
except:
  print(-1)
