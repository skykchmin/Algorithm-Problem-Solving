def solution(absolutes, signs):
    result = 0
    for i in range(len(signs)):
        minus = 1
        if not signs[i]:
            minus = -1
            
        result += minus * absolutes[i] 
    #print(result)
    return result
