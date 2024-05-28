# 1 
x = input()
    
def solution(x):
    temp = 0
    number = int(x)

    for i in range(len(x)):
        temp += int(x[i])
    
    if number % temp == 0:
        print(True)
        return True    
    else:
        print(False)
        return False

# # 2
# def solution(x):
#     temp = 0
#     number = list(str(x))

#     for i in range(len(number)):
#         temp += int(number[i])
#         if x % temp == 0:
#             answer = True    
#         else:
#             answer = False
#     return answer

# # 3
# def solution(x):
#     return x % sum([int(c) for c in str(x)]) == 0



solution(x)