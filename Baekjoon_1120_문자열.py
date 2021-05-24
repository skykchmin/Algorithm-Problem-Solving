X, Y = input().split()

answer = []
for i in range(len(Y) - len(X) + 1):
    count = 0
    for j in range(len(X)):
        if X[j] != Y[i+j]:
            count += 1
    answer.append(count)

print(min(answer))
        
