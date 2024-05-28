N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

sort_A = sorted(A)
sort_B = sorted(B, reverse = True)

result = 0
for i in range(N):
    temp = sort_A[i] * sort_B[i]
    result += temp

print(result)