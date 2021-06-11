N = int(input())
card = sorted(map(int, input().split()))
M = int(input())
search = map(int, input().split())

def binary(target, card, start, end):
    if start > end:
        return 0
    mid = (start + end) // 2
    if target == card[mid]:
        return card[start : end+1].count(target)
    elif target < card[mid]:
        return binary(target, card, start, mid - 1)
    else:
        return binary(target, card, mid + 1, end)

target_dic = {}
for target in card:
    start = 0
    end = len(card) - 1
    if target not in target_dic:
        target_dic[target] = binary(target, card, start, end)

print(' '.join(str(target_dic[x]) if x in target_dic else '0' for x in search ))
