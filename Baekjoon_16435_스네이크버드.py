N, L = map(int, input().split())
h = list(map(int, input().split()))

sort_h = sorted(h)

for i in sort_h:
    if L >= i:
        L += 1
    else:
        break
print(L)