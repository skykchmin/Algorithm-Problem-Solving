from collections import deque

N, M = map(int, input().split())
numbers = list(map(int, input().split()))
queue = deque(range(1, N+1))

count = 0
for idx in range(len(numbers)):
    if numbers[idx] == queue[0]:
        queue.popleft()
        continue
    queue_idx = queue.index(numbers[idx])
    # 뒤에서 앞으로 회전 
    if queue_idx > len(queue) // 2:
        queue.rotate(len(queue) - queue_idx)
        count += (len(queue) - queue_idx)
    # 앞에서 뒤로 회전
    elif queue_idx <= len(queue) // 2:
        queue.rotate(-queue_idx)
        count += queue_idx
    queue.popleft()

print(count)
