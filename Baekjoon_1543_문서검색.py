word = input() # 문자열
target = input() # 검색하고 싶은 단어
count = 0
i = 0

while i <= len(word) - len(target):
    if word[i:i+len(target)] == target:
        count += 1
        i += len(target)
    else:
        i += 1
print(count)
