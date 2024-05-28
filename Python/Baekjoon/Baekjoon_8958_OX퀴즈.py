Testcase = int(input())
for i in range(Testcase):
    num = input()
    score = 0
    cnt = 0
    for j in range(len(num)):
        if num[j] == 'O':
            cnt += 1
            score += cnt
        elif num[j] == 'X':
            cnt = 0
            score = 0
    print(score)
