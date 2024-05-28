number = input()
temp = []
word = 0
for i in range(len(number)):
    temp.append(number[i])
ordered_number = sorted(temp, reverse = True)
for j in range(len(ordered_number)):
    print(ordered_number[j], end="")

# 다른 사람의 코드
nums = input()
nums = [int(n)  for n in nums]

ordered_nums = sorted(nums, reverse=True)

for n in ordered_nums : 
    print(n, end="")