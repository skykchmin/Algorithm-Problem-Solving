N, M = map(int, input().split())
wood = list(map(int, input().split()))

start, end = 1, max(wood) 

while start <= end:
    mid = (start + end) // 2

    target = 0
    for i in wood:
        if i >= mid:
            target += i - mid

    if target >= M:
        start = mid + 1
    else:
        end = mid - 1
print(end)

# while True:
#     target = 0 # 임시 높이
    
#     for i in wood:
#         temp = i - woodMax
#         if target >= woodMax:
#             print(woodMax)
#             break
#         else:
#             if temp < 0:
#                 target += 0
#             else:
#                 target += temp
#     woodMax - 1


    

    

