phone_number = input()

#1
def solution(phone_number):
    blockindex = len(phone_number) - 4
    if(blockindex == 0):
        return phone_number
    else:
        new_phone_number = ('*' * blockindex) + phone_number[blockindex:]
        return new_phone_number

solution(phone_number)

#2
def hide_numbers(s):
    return "*"*(len(s)-4) + s[-4:]

