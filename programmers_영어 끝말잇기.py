def solution(n, words):
    answer = [0, 0]
    word_list = []
    word_list.append(words[0])
    for j in range(1, len(words)):
        if words[j-1][-1] == words[j][0] and words[j] not in word_list:
            word_list.append(words[j])
        else:
            answer[0] = j % n + 1
            answer[1] = j // n + 1
            break
                 
    return answer

# def solution(n, words):
#     answer = [0, 0]
#     temp = 1
#     word_list = []
#     word_list.append(words[0])
#     for j in range(0, len(words) - 1):
#         # print(words[j][-1])
#         # print(words[j+1][0])
#         if words[j][-1] == words[j+1][0] and words[j] not in word_list:
#             temp += 1
#             word_list.append(words[j])
#         else:
#             answer[0] = j % n + 1
#             answer[1] = j // n + 1
#             break
                 
#     return answer