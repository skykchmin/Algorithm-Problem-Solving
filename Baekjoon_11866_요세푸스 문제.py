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



# 다른 사람 풀이
N, K = map(int, input().split()) 
circular_list = [] 
answer = []
for i in range(N): circular_list.append(i+1) 
popNum = 0 

while len(circular_list) > 0:
    popNum = (popNum + (K-1)) % len(circular_list) 
    popElemnet = circular_list.pop(popNum) 
    answer.append(str(popElemnet)) 
    
print("<%s>" %(", ".join(answer)))

