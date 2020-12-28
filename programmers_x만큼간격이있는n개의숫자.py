x, n = list(map(int, input().split()))

# def solution(x, n):
#     answer = []
#     temp = 0 
#     for i in range(1, n+1):
#         temp = x * i 
#         answer.append(temp)
#     return answer

#2
# def number_generator(x, n):
#     # 함수를 완성하세요
#     return [i * x + x for i in range(n)]

# x, n = list(map(int, input().split()))

def solution(x, n):
    answer = []
    for i in range(1, n+1):
        answer.append(x * i)
    print(answer)
    return answer

solution(x, n)


