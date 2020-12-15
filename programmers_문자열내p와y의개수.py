s = input()


# 1
def solution(s):
    pcount = 0
    ycount = 0
    word = s.lower()
    if len(word) < 50:
        for i in range(len(word)):
            if(word[i] == 'p'):
                pcount += 1
            elif(word[i] == 'y'):
                ycount += 1
        if(pcount == ycount):
            print(True)
            return True
        else:
            print(False)
            return False

# 2
def solution(s):
    answer = True
    lower = s.lower()
    pcount = lower.count('p')
    ycount = lower.count('y')

    if (pcount == ycount):
        return True
    else:
        return False
                 
solution(s)