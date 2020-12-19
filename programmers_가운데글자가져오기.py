s = input()

def solution(s):
    length = len(s)
    half = int(length / 2)
    if length % 2 == 0: #짝수일 경우
        return (s[half - 1] + s[half])
    else: #홀수 일 경우
        return s[half]

solution(s)

#2 

def string_middle(str):
    return str[(len(str)-1)//2:len(str)//2+1]