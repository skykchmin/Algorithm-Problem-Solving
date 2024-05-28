computer = int(input())
network = int(input())
graph = [[] for i in range(computer+1)]
visited =[]

for i in range(network):
    start, end = map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)

tovisit = [1]
while tovisit:
    start = tovisit.pop()
    visited.append(start)
    for i in graph[start]:
        if i not in visited + tovisit:
            tovisit.append(i)

print(len(visited)-1)

