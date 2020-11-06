# def plus_one(x):
#     return x+1

# print(plus_one(1))

# plus_two = lambda x: x+2 #변수에다가 할당, x가 변수
# print(plus_two(1))

def plus_one(x):
    return x+1

# 람다함수는 표현식, 내장함수의 인자로 사용될 떄 편리하다
a = [1, 2, 3]
print(list(map(plus_one, a))) # map(함수명, 자료)
# 함수를 위처럼 만들지 않고 괄호안에 바로 만들어버리는것이 람다식

print(list(map(lambda x: x+1, a)))
