s = "try hello world"

# def solution(s):
#     list_s = list(s)
#     for j in range(len(list_s)):
#         if j % 2 == 0:
#             list_s[j] = list_s[j].upper()
#         else:
#             list_s[j] = list_s[j].lower()
#     answer = "".join(list_s)
#     return(answer)

def solution(s):
    list_split = s.split(" ")

    for i in range(len(list_split)):
        list_s = list(list_split[i])
        for j in range(len(list_s)):
            if j % 2 == 0:
                list_s[j] = list_s[j].upper()
            else:
                list_s[j] = list_s[j].lower()
        list_split[i] = "".join(list_s)

    answer = " ".join(list_split)
    return(answer)

solution(s)


