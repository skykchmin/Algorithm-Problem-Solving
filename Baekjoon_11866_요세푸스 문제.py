from collections import deque

queue = deque()
N, K = map(int, input().split())

result = []
for i in range(N): 
    queue.append(i + 1) 

for j in range(N):
    queue.rotate(-(K-1))
    result.append(str(queue.popleft()))

print("<%s>" %(", ".join(result)))



   