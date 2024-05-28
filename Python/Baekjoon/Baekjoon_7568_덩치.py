N = int(input())

people = []
for i in range(N):
    weight, height = map(int, input().split())
    people.append((weight, height))

for j in people:
    rank = 1
    for k in people:
        if j[0] < k[0] and j[1] < k[1]:
            rank += 1
    print(rank, end = " ")

# w_people = sorted(people, key = lambda x: (-x[0]))
# h_people = sorted(people, key = lambda x: (-x[1]))
# print(w_people)
# print(h_people)

# for j in range(len(people)):
