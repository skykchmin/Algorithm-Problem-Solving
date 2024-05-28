arr = list(map(int, input().split()))

def solution(arr):
    arr.remove(min(arr))
    if int(len(arr)) >= 1:
        return arr
    else:
        print([-1])
        return [-1]

solution(arr)