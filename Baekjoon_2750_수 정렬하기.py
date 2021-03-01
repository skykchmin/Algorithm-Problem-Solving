n = int(input())

temp = []
for i in range(n):
    temp.append(int(input()))
    temp.sort()
for j in range(n):
    print(temp[j])


# 다른사람 풀이
# 1.
#수 정렬하기 (오름차순) 
# testCase = int(input()) 
# num = [] 
# save = 0 
# for i in range(testCase): 
#   num.append(int(input())) 
# for j in range(testCase): 
#   for k in range(testCase-(j+1)): 
#       if num[k] >= num[k+1]: #뒤에꺼가 더 큰 경우 
#           save = num[k+1] 
#           num[k+1] = num[k] 
#           num[k] = save 
# for l in num: 
#     print(l)

