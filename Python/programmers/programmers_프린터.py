def solution(priorities, location):
    answer = 0
    cnt = 0
    while(len(priorities)):
        if location == 0:
            if priorities[0] < max(priorities):
                priorities[0].append(priorities.pop(0))
                location = len(priorities) - 1
            else:
                return cnt + 1
        else:
            if priorities[0] < max(priorities):
                priorities.append(priorities.pop(0))
                location -=1
            else:
                priorities.pop(0)
                location -= 1
                cnt += 1

# 내가 푼 답(오답)

# def solution(priorities, location):
#     answer = 0

#     while(len(priorities)):
#         first = priorities.pop(0)
#         if location == 0: #0일 경우
#             if first < max(priorities): 
#                 priorities.append(first) 
#                 location = len(priorities) - 1
#             else:
#                 return answer + 1
#         else: #location이 1보다 클 경우
#             if first < max(priorities):
#                 priorities.append(first)
#                 location -= 1
#             else: #location이 1보다 크면서, max가 아닐 경우
#                 location -= 1
#                 answer += 1

