n = int(input())

def solution(n):
    result = 0
    temp = n**(1/2)
    if temp**2 == n:
        result = int((temp + 1) ** 2)
        return result
    else:
        return -1

solution(n)