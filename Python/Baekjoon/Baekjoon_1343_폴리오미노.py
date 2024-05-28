word = input()
i = 0

while True:
    if i >= len(word):
        break

    if word[i:i+4] == 'XXXX':
        i = i + 4
        word = word.replace('X', 'A', 4)
    elif word[i:i+2] == 'XX':
        i = i + 2
        word = word.replace('X', 'B', 2)
    elif word[i] == '.':
        i = i + 1
    else:
        word = -1
        break

print(word)