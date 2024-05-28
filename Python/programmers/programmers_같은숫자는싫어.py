arr = list(map(int, input().split()))

# 1
def solution(arr):
    answer = []
    length = len(arr)
    temp = 0
    for i in range(length):
        if temp != arr[i]:
            temp = arr[i]
            answer.append(arr[i])
        else:
            continue
    return answer

#2
def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in range(1, len(arr)):
        if arr[i] != arr[i-1]:
            answer.append(arr[i])
    return answer

#3

def no_continuous(s):
    a = []
    for i in s:
        if a[-1:] == [i]: continue
        a.append(i)
    return a


# solution(arr)