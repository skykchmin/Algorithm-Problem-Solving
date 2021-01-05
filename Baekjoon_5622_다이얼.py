word = input()
# alphabet = list(map(chr, range(97,123)))
# print(alphabet)


# print(alphabet[1])

# def diolog(word):
#     temp = []
#     for i in word:
#         temp.append(i)
#     print(temp)

# diolog(word)

word = input()
def diolog(word):
    result = 0
    dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ'];

    for i in range(len(word)):
        for j in dial:
            if word[i] in j:
                result += dial.index(j)+3
    print(result)

diolog(word)