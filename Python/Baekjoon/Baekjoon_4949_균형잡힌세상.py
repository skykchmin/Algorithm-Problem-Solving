while True:
    s = input()
    if s == '.':
        break
    isValid = 'yes'
    wordlist = []
    for i in s:    
        if i == '(' or i == '[': #여는 괄호일 경우
            wordlist.append(i)
        elif i == ']': # 닫는 괄호가 ']' 경우
            if(len(wordlist) == 0 or wordlist[-1] != '['):
                isValid = 'no'
                break
            elif wordlist[-1] == '[': # 스택의 top과 짝이 맞을 경우
                wordlist.pop()
        elif i == ')': # 닫는 괄호가 ')' 경우
            if(len(wordlist) == 0 or wordlist[-1] != '('):
                isValid = 'no'
                break
            elif wordlist[-1] == '(': # 스택의 top과 짝이 맞을 경우
                wordlist.pop()
    if len(wordlist) > 0:
        isValid = 'no'
    print(isValid)

            
