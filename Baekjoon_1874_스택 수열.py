N = int(input())

stk = []
op = []
count = 1

for i in range(N):
    num = int(input())
    while count <= num:
        stk.append(count)
        op.append('+')
        count += 1
    if stk[-1] == num:
        stk.pop()
        op.append('-')
    else:
        temp = False
if temp == False:
    print('NO')
else:
    for i in op:
        print(i)


# for j in range(1, 100000):
#     for k in stk:
#         if j == temp[j - 1]:
#             if j in stk:
#                 temp.pop()
#                 stk.pop()
#                 print('-')
#             else:
#                 print('NO')
#         else:
#             stk.append(j)
#             print('+')
#     break
        

