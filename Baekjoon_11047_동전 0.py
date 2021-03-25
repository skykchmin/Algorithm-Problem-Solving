N, K = map(int, input().split())
count = 0
money_types = []

for i in range(N):
    money_types.append(int(input())) # 돈의 단위를 입력받는다

money_types.reverse() # 돈을 가장 큰 단위로 정렬한다 -> 그리디

for money in money_types:
    count += K // money
    K %= money

print(count)
