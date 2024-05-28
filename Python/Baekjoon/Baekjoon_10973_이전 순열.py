# 메모리 초과

# from itertools import permutations

# N = int(input())
# word = tuple(map(int, input().split()))

# li = []
# for i in range(1, N + 1):
#     li.append(i)

# per = list(permutations(li, N))

# for j in range(len(per)):
#     if word == per[j]:
#         if j == 0:
#             print(-1)
#         else:
#             answer = per[j-1]

# for k in answer:
#     print(k, end=' ')


# 
n = int(input())
nums = list(map(int, input().split()))
tag = False

for i in range(n-1, 0, -1):
    if nums[i-1] > nums[i]:
        
        for j in range(n-1, 0, -1):
            if nums[i-1] > nums[j]:
                
                nums[i-1], nums[j] = nums[j], nums[i-1]
                
                nums = nums[:i] + sorted(nums[i:], reverse = True)
                tag = True
                break
    if tag:
        print(*nums)
        break
        
if not tag: 
    print(-1)