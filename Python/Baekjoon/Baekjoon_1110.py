# #더하기 사이클
# #https://www.acmicpc.net/problem/1110


first_number = int(input())
second_number = 0
result = 0
cnt = 1
newnumber = first_number # 숫자를 복사 

while True:
    second_number = first_number % 10
    first_number = int(first_number / 10)
    result = first_number + second_number
    first_number = (second_number * 10) + result % 10
 
    if(newnumber == first_number):
        break
    else:
        cnt += 1 

print(cnt)
        


