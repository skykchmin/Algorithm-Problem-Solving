# seoul = list(map(str, input().split()))

# def solution(seoul):
#     place = seoul.index('kim')
#     answer = '김서방은 ' + place + '에 있다'
#     return answer

# solution(seoul)

# 
def solution(seoul):
    return '김서방은 ' + str(seoul.index('kim')) + '에 있다'