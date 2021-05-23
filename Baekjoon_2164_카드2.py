from collections import deque

N = int(input())
Deque = deque()
for i in range(1, N + 1):
    Deque.append(i)

while True:
    if len(Deque) != 1:
        Deque.popleft()
        temp = Deque.popleft()
        Deque.append(temp)
    else:
        print(Deque[0])
        break
    

# 다른 사람 풀이

# import sys 
# from collections import deque 
# N = int(sys.stdin.readline()) 
# queue = deque() 

# for i in range(N): 
#     queue.append(i + 1) 

# while len(queue) > 1: 
#     queue.popleft() 
#     queue.append(queue.popleft()) 
#     print(queue.pop())

