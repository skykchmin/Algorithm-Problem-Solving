import math

N = int(input())

result = str(math.factorial(N))

count = 0
for i in range(1, len(result)+1):
    if result[-i] == '0':
        count += 1
    else:
        break

print(count)



