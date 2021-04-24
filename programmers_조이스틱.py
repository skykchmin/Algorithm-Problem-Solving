def solution(name):
    make_name = [min(ord(i) - ord("A"), ord("Z") - ord(i)+1) for i in name]
    idx, answer = 0, 0
    while True:
        answer += make_name[idx]
        make_name[idx] = 0
        if sum(make_name) ==0:
            break
        left, right = 1, 1
        while make_name[idx - left] ==0:
            left +=1
        while make_name[idx + right] ==0:
            right +=1
        answer += left if left < right else right
        idx += -left if left < right else right
    return answer

# 나의 답 (오답)
# def solution(name):
#     answer = 0
#     cnt = 0
#     for i in range(len(name)):
#         if ord(name[i]) >= ord(alphabet[13]): # 오른쪽
#             cnt += ord('Z') - ord(name[i]) + 1
#             print(cnt)
#         else:
#             cnt += (ord(name[i]) - ord('A'))
#             print(cnt)
#     return cnt


