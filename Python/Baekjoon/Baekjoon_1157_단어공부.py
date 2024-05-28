word = input().upper()
wordlist = list(set(word))
cnt = []

for i in wordlist:
    wordcount = word.count(i)
    cnt.append(wordcount)

if cnt.count(max(cnt)) >= 2:
    print('?')
else:
    print(wordlist[cnt.index(max(cnt))].upper())