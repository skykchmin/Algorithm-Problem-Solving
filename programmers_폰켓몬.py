nums = [3,3,3,2,2,4]

def solution(nums):
    set_nums = set(nums)
    if len(list(set_nums)) < len(nums) / 2:
        return len(list(set_nums))
    else:
        return len(nums) / 2

solution(nums)