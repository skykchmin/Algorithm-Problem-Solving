from itertools import permutations

N = int(input())
K = int(input())

cards = [input().rstrip() for i in range(N)]
temp = set()
for per in permutations(cards, K):
    temp.add(''.join(per))

print(len(temp))