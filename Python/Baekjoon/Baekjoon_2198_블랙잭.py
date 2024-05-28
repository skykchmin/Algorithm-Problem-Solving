from itertools import combinations

N, M = map(int, input().split())

temp = list(map(int, input().split()))
com_temp = list(combinations(temp, 3))
result = 0

for num in combinations(temp, 3):
    arr_sum = sum(num)
    if result < arr_sum <= M:
        result = arr_sum

print(result)

