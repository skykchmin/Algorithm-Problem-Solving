#Baekgoon_10039
#https://www.acmicpc.net/problem/10039

score_list=[]

for i in range(5):
    score = int(input())
    if score >= 40:
        score_list.append(score)
    else:
        score_list.append(40)

print(round(sum(score_list)/5))
