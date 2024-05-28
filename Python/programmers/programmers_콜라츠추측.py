number = int(input())
count = 0

def solution(number):
    global count
    if count <= 500:
        if number % 2 == 0: # 짝수
            number = (number // 2)
            count += 1
            solution(number)
        else:   #홀수라면 
            if number != 1: #1이 아니라면
                number = (number * 3) + 1
                count += 1
                solution(number)
            else: #1이라면 
                print(count)
                return count
    else:
        return -1
            
solution(number)

# 2 

def solution(num):
    count = 0
    if num == 1:
        return 0
    while True:
        num = num/2 if num % 2 == 0 else (num*3)+1
        count += 1
        if num == 1:
            # print(count)
            return count
        elif count > 500:
            # print(count)
            return -1
    # print(count)
    return count

# solution(number)