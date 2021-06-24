def solution(s):
    stk = []
    for c in s:
        if stk:
            if stk[-1] == c:
                stk.pop()
            else:
                stk.append(c)
        else:
            stk.append(c)
    if stk:
        return 0
    else:
         return 1       
    