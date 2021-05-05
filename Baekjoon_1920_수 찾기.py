N = int(input())
list_N = list(map(int, input().split()))
M = int(input())
list_M = list(map(int, input().split()))

list_N.sort()

for i in list_M:
    start = 0 
    end = N - 1
    target = i
    answer = 0
    while (start <= end):
        mid = (start + end) // 2
        if list_N[mid] == target:
            answer = 1
            break
        elif target < list_N[mid]:
            end = mid - 1
        else:
            start = mid + 1
    print(answer)
