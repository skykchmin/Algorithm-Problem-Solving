N = int(input())

for i in range(N):
    isValid = 'YES'
    temp = input()
    bracket = []
    for j in range(len(temp)):
        if temp[j] == '(':
            bracket.append(temp[j])
        else:
            if (len(bracket) == 0 or bracket[-1] != '('):# 스택이 비어있거나 스택의 top이 짝이 맞지 않는 괄호일 경우
                isValid = 'NO'
                break
            elif temp[j] == ')': #스택의 top이 짝이 맞는 괄호일 경우 pop
                bracket.pop()
    if len(bracket) > 0:
        isValid = 'NO'
    print(isValid)