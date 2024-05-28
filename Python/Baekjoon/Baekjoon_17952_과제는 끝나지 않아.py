from collections import deque

N = int(input())

stk = deque()
time = deque()
answer = deque()

for i in range(N):
    temp = list(map(int, input().split()))
    if temp[0] == 1:
        stk.append(temp[1])
        time.append(temp[2])
    else:
        pass
    if time:
        time[-1] -= 1
        if time[-1] == 0:
            time.pop()
            answer.append(stk.pop())

print(sum(answer))
