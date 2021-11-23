A, B = map(int, input().split())
# A_set = [input() for _ in range(A)]
# B_set = [input() for _ in range(B)]

# print(A_set)
# print(B_set)

A_set = set(map(int, input().split()))
B_set = set(map(int, input().split()))

print(len(A_set ^ B_set))