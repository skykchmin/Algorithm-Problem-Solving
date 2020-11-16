# Testcase = int(input())

# wordlist = []

# for i in range(Testcase):
#     string = input().split()
#     count = int(string[0]) # 반복할 횟수
#     word =  string[1] # 문자열 자체

#     for j in range(count):
#         wordlist.append(word[j]*count)
#     word = ''.join(wordlist) # 배열 요소 합치기
#     print(word)
    # print(wordlist)
    
Testcase = int(input())

for i in range(Testcase):
    count, word = input().split()
    for j in range(len(word)):
        print(word[j]*int(count), end='')
    print()
    



