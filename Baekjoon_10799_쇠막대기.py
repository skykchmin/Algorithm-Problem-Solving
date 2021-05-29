bracket = input()

stk = [] 
answer = 0

for token in bracket:
    if token == '(':
        stk.append(token)
        last = token
    else:
        if last == '(':
            stk.pop()
            answer += len(stk)
            last = token
        else:
            stk.pop()
            answer += 1
print(answer)
    