lottos = [44, 1, 0, 0, 31, 25]
win_nums = [31, 10, 45, 1, 6, 19]

def solution(lottos, win_nums):
    # rank = {1:6, 2:5, 3:4, 4:3, 5:2, 6:1}
    rank = [6, 6, 5, 4, 3, 2, 1]
    answer = []
    count = 0
    zeroCount = 0
    for k in lottos:
        if k == 0:
            zeroCount += 1

    for i in range(len(win_nums)):
        for j in range(len(lottos)):
            if lottos[i] == win_nums[j]:
                count += 1
    best = count + zeroCount
    
    return rank[best], rank[count]
    
solution(lottos, win_nums)


# 다른사람의 풀이
def solution(lottos, win_nums):

    rank=[6,6,5,4,3,2,1]

    cnt_0 = lottos.count(0)
    ans = 0
    for x in win_nums:
        if x in lottos:
            ans += 1
    return rank[cnt_0 + ans],rank[ans]