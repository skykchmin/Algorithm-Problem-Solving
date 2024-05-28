n = input()

def solution(n):
    word = str(n)
    print(type(n))
    answer = 0
    for i in word:
        answer += int(i)
    return answer
    
solution(n)

