# 메모리 초과
# N = int(input())

# temp = []
# for i in range(1, N + 1):
#     temp.append(str(i))

# result = "".join(temp)
# print(len(result))

#3
n = int(input())

length = len(str(n))

ans = 0
for i in range(1, length):
    ans += i * (pow(10, i) - pow(10, i - 1))
ans += length * (n - pow(10, length - 1) + 1)
print(ans)