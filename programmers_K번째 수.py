array = [1, 5, 2, 6, 3, 7, 4]
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]

def solution(array, commands):
    result = []
    for i in range(len(commands)):
        temp = array[commands[i][0] - 1:commands[i][1]]
        temp.sort()
        result.append(temp[commands[i][2]-1])
    # print(result)
    return result

solution(array, commands)

# 다른사람 풀이
def solution(array, commands):
    return list(map(lambda x:sorted(array[x[0]-1:x[1]])[x[2]-1], commands))
