N = int(input())

measure = list(map(int, input().split()))
sort_measure = sorted(measure)
result = 0
index = len(sort_measure) // 2
if N % 2 == 0:
    result = sort_measure[index - 1] * sort_measure[index]
else:
    result = sort_measure[index]**2
print(result)
