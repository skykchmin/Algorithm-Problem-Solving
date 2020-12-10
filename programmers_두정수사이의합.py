a,b = map(int, input().split())

def solution(a, b):
    result = 0
    if a == b:
        result = a
    elif a < b:
        for i in range(a, b+1):
            result += i
    else:
        for i in range(b, a+1):
            result += i
    return result

solution(a, b)