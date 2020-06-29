x = int(input())
y = int(input())

# 첫번째 방법
if x > 0 and y > 0:
    print("1")
elif x < 0 and y > 0:
    print("2")
elif x < 0 and y < 0:
    print("3")
else:
    print("4") 


# 2번째 방법
# if(x>0):
#     if(y>0):
#         print("1")
#     else:
#         print("4")
# else:
#     if(y>0):
#         print("2")
#     else:
#         print("3")

