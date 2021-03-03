K = input()
temp = []
sum = 0
for i in range(int(K)):
    number = int(input())
    if number == 0:
        del temp[-1]
    else:
        temp.append(number)
for j in range(len(temp)):
    sum += temp[j]
print(sum)
    



