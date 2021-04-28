numbers = list(map(int, input().split()))

def solution(numbers):
    answer= []
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            answer.append(numbers[i] + numbers[j])
    answer = sorted(list(set(answer)))
    print(answer)
    return answer

solution(numbers)