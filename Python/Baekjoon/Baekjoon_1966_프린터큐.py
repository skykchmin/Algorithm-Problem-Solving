from collections import deque

testcase = int(input())

for i in range(testcase):
    count = 0
    N, M = map(int, input().split())
    priority = deque(map(int, input().split()))
    chk = deque([0 for _ in range(N)])
    chk[M] = 'target'

    M = priority[int(M)]
    while True:
        if priority[0] == max(priority):
            count += 1
            if chk[0] == 'target':
                print(count)
                break
            else:
                priority.popleft()
                chk.popleft()
        else:
            priority.append(priority.popleft())
            chk.append(chk.popleft())


# for i in range(testcase):
#     answer = 0
#     N, M = input().split()
#     priority = deque(map(int, input().split()))

#     M = priority[int(M)]
#     while M in priority:
#         if priority[0] == max(priority):
#             answer += 1
#             priority.popleft()
#         else:
#             priority.append(priority.popleft())
#     print(answer)