N = int(input())

book = {}
for i in range(N):
    temp = input().lower()
    if temp in book.keys():
        book[temp] += 1
    else:
        book[temp] = 1

max_value = max(book.values())

best = []
for book, number in book.items():
    if number == max_value:
        best.append(book)

print(sorted(best)[0])

# 다른 사람 풀이
# from collections import Counter

# n = int(input())
# books = []
# for _ in range(n):
#     books.append(input())

# books.sort()
# cnt = Counter(books)

# print(cnt.most_common(n=1)[0][0])
