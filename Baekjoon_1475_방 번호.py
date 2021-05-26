import math

num_list = [ 0 for i in range(10)]

number = input()

for i in range(len(number)):
    if int(number[i]) == 6 or int(number[i]) == 9:
        num_list[6] += 0.5 # 0.5로 한 이유는 이후에 최대값을 구한다음 반올림해야하기 때문에
    else:
        num_list[int(number[i])] += 1

print(math.ceil(max(num_list)))

    
