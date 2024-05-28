numlist = []

for i in range(9):
    num = int(input())
    numlist.append(num)

maxnumber = max(numlist)
idxnum = numlist.index(maxnumber)

print(maxnumber)
print(idxnum+1)
