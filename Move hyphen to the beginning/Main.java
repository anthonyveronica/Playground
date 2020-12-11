str1 = input()
count = 0
str2 =""
for i in str1:
    if i == '-':
        count+=1
    else:
        str2+=i
print("-"*count+str2)