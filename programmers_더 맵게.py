import heapq
scoville = [1, 2, 3, 9, 10, 12]
K = 7

# def solution(scoville, K):
#     answer = 0
#     for i in range(len(scoville)):
#         sorted(scoville)
#         if scoville[0] >= K:
#             print(answer)
#             return answer
#         else:
#             temp = scoville[0] + scoville[1] * 2
#             scoville.pop(0)
#             scoville[0] = temp
#             answer += 1

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while scoville[0] < K:
        if len(scoville) > 1:
            heapq.heappush(scoville, heapq.heappop(scoville) + (heapq.heappop(scoville) * 2))
            answer += 1
        else:
            return -1
    print(answer)
    return answer

solution(scoville, K)