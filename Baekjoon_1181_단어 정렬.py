N = int(input())
temp = []

for i in range(N):
    word = input()
    if word in temp:
        continue
    else:
        temp.append(word)

temp.sort()
temp = sorted(temp, key = lambda x: len(x))

for i in temp:
    print(i)


