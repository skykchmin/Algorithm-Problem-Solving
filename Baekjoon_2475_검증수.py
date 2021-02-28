a = list(map(int, input().split()))

sum = 0 
for i in range(5):
    sum += a[i]**2
    validation = sum % 10
print(validation)

# 문자열 버전일 때 

# def solution(number):
#     sum = 0
#     temp = []
#     validationlist = []
#     for i in range(5):
#         temp.append(number[i])
#     for j in range(5):
#         validationlist.append(int(temp[j])**2)
#     for k in range(5):
#         sum += validationlist[k]
    
#     validation = sum % 10
#     print(validation)

# solution(number)