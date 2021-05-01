from itertools import permutations

# numbers = [6, 10, 2]

def solution(numbers):
    list_per = []
    temp = []
    wordlist = []
    list_per = list(permutations(numbers, len(numbers)))
    for i in range(len(list_per)):
        temp = list(map(str ,list_per[i])) # 문자열을 숫자로 바꾼다    
        wordlist.append("".join(temp))
    return max(wordlist)
    
 
 # 다른 사람의 풀이
def solution(num): 
    num = list(map(str, num)) 
    num.sort(key = lambda x : x*3, reverse = True) 
    return str(int(''.join(num)))

