n=int(input())
arr=list(input().strip().split(" "))
for i in range(0,len(arr)):
  arr[i]=int(arr[i])
pos,ele=list(input().strip().split(" "))
pos=int(pos)
ele=int(ele)
arr.insert(pos-1,ele)
for i in range(0,len(arr)):
  print(arr[i],end=" ")