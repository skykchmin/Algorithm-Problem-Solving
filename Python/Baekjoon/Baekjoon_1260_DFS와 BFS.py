from collections import deque

N, M, V = map(int, input().split())

graph = [[] for _ in range(N+1)]
graph[0] = [0, 0]
visited = [False for _ in range(N+1)]

for _ in range(M):
    start, end = map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)
    graph[start].sort()
    graph[end].sort()

def dfs(graph, start, visited):
    visited[start] = True
    print(start, end=" ")

    for i in graph[start]:
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph, start, visited):
    queue = deque([start])

    # 현재 노드를 방문 처리
    visited[start] = True

    # 큐가 빌 때까지 반복
    while queue:
        v = queue.popleft()
        print(v, end = ' ')
        # 해당 원소와 연결된 아직 방문하지 않은 원소들을 큐에 삽입
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

dfs(graph, V, visited)
visited = [False for _ in range(N+1)]
print()
bfs(graph, V, visited)
