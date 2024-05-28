from itertools import combinations

def is_prime_number(num):
    if num == 0 or num == 1:
        return False
    else:
        for n in range(2, (num//2)+1):     
            if num % n == 0:
                return False
        
        return True

def solution(nums):
    sum_list = []
    answer = 0
    temp = list(combinations(nums, 3))
    for i in range(len(temp)):
        sum_list.append(sum(temp[i]))
    for j in sum_list:
        if is_prime_number(j):
            answer += 1
    return answer
    
