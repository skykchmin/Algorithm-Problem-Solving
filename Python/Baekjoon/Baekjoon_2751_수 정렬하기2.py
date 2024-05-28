N = int(input())

temp = []
for i in range(N):
    temp.append(int(input()))

temp = sorted(temp)

for j in range(N):
    print(temp[j])

