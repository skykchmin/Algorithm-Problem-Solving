# 1) 글자수 파악
# 2) 글자수를 내림차순 정렬을 한다
# 3) max 함수를 이용하여 숫자 리턴
# 4) 0일 경우 숫자를 return 
def max_digit(number: int) -> int:
    try:
        number_list = list(map(int, list(str(number))))
        number_list.sort(reverse=True)
        value = 0

        for i in number_list[:1]:
            value += i

        return value 
    
    except ZeroDivisionError:
        return number


if __name__ == '__main__':
    print("Example:")
    print(max_digit(0))

    # These "asserts" are used for self-checking and not for an auto-testing
    assert max_digit(0) == 0
    assert max_digit(52) == 5
    assert max_digit(634) == 6
    assert max_digit(1) == 1
    assert max_digit(10000) == 1
    print("Coding complete? Click 'Check' to earn cool rewards!")

