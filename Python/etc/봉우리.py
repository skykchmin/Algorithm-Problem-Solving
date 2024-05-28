dx = [-1, 0, 1, 0]
dy = [0, 1, 0 , -1]

n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
a.insert(0, [0]*n) #n개의 리스트가 맨앞에 넣어진다 
a.append([0]*n) #n개의 리스트가 맨뒤에 넣어진다

for x in a: # 한개의 행
    x.insert(0, 0) #왼쪽과 오른쪽
    x.append(0)

cnt = 0 
for i in range(1, n+1):
    for j in range(1, n+1):