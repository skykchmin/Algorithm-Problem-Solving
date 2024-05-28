n = int(input())

def solution(n):
    answer = n + 1
    while True:
        if bin(answer).count('1') == bin(n).count('1'):
            return answer
        answer += 1

solution(n)