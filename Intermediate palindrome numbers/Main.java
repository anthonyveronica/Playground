mi=list(input().strip().split(" "))
ma=list(input().strip().split(" "))
mi=int(mi[0])
ma=int(ma[0])
palindromes =[x for x in range(mi,ma+1,1) if str(x)==str(x)[::-1]]
for i in range(0,len(palindromes)):
  print(palindromes[i],end=" ")