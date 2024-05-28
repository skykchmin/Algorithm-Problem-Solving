S = input()

stk = []
count = 0
for i in range(len(S)):
    if S[i] == '(':
        stk.append(S[i])
    else:
        if (len(stk) == 0 or stk[-1] != '('):
            stk.append(S[i]) # 올바르지 않은 괄호라도 stk에 넣는다
        elif S[i] == ')':
            stk.pop()
print(len(stk))

