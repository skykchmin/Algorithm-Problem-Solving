A, B = map(int, input().split())

listA = set(map(int, input().split()))
listB = set(map(int, input().split()))

diff = sorted(list(listA - listB))

if len(diff) == 0:
    print(0)
else:
    print(len(diff))
    for element in diff:
        print(element, end = ' ')


