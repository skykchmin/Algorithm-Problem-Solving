num = int(input())

# def group_word(num):
#     wordlist = []
#     for i in range(num):
#         word = input()
#         for j in word:
#             # print(j)  한단어로 쪼개짐
#             if j != len(word) - 1:

#                 print(j)
#                 wordlist.append(j)
#         # wordlist.append(word)
#     print(wordlist)

def group_word(num):
    count = 0
    for i in range(num):
        word = input()
        for j in range(len(word)):
            if j != len(word) - 1:
                if word[j] == word[j+1]:
                    continue
                else:
                    if word[j] in word[j+1:]:
                        break
            else:
                count += 1
    print(count)

# def group_word(num):
#     for i in range(num):
#         word = input()
#         for j in range(len(word)):
#             if word.find(word[j-1]) > word.find(word[j]):
#                num -= 1
#                break
#     print(num)

group_word(num)