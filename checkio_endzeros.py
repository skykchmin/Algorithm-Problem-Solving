#리버스를 이용해본다
#리버스를 해서 0이 나오기전까지를 count해본다.
def end_zeros(num: int) -> int:
    n = 0

    for i in reversed(str(num)):
        if i == '0':
            n += 1
        else:
            return n
    return n


if __name__ == '__main__':
    print("Example:")
    print(end_zeros(0))

    # These "asserts" are used for self-checking and not for an auto-testing
    assert end_zeros(0) == 1
    assert end_zeros(1) == 0
    assert end_zeros(10) == 1
    assert end_zeros(101) == 0
    assert end_zeros(245) == 0
    assert end_zeros(100100) == 2
    print("Coding complete? Click 'Check' to earn cool rewards!")
