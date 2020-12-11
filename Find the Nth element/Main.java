n=int(input())
arr=list(input().strip().split(" "))
pos=int(input())
if(pos<len(arr)):
  print(arr[pos-1])
else:
  print("No node found")